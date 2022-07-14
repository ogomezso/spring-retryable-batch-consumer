package org.github.ogomezso.springretryablebatchconsumer;

import java.util.Random;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.github.ogomezso.springretryablebatchconsumer.model.Users;
import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.kafka.retrytopic.TopicSuffixingStrategy;
import org.springframework.retry.annotation.Backoff;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class RetryableUsersConsumer {

    @RetryableTopic(attempts = "1", 
    backoff = @Backoff(delay = 1000, multiplier = 2.0), 
    autoCreateTopics = "false", 
    topicSuffixingStrategy = TopicSuffixingStrategy.SUFFIX_WITH_INDEX_VALUE)
    @KafkaListener(topics = "datagen_users")
    public void consume(ConsumerRecord<String,Users> record) {
      log.info("Record: {}, offset: {}, partition: {}", record.value(), record.offset(), record.partition());
      if (getRandomNumberInRange(1,3) == 1){
        throw new RuntimeException("error!");
      } 
    }

    @DltHandler
    public void dlt(ConsumerRecord<String,Users> record) {
      log.info("record with offset: {}, sent to DLT", record.offset());
    }

    private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}
