package org.github.ogomezso.springretryablebatchconsumer;

import java.time.Duration;
import java.util.Random;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.github.ogomezso.model.Users;
import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.kafka.retrytopic.TopicSuffixingStrategy;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.retry.annotation.Backoff;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class RetryableUsersConsumer {

  // @RetryableTopic(attempts = "1", backoff = @Backoff(delay = 1000, multiplier = 2.0), autoCreateTopics = "false", topicSuffixingStrategy = TopicSuffixingStrategy.SUFFIX_WITH_INDEX_VALUE)
  @KafkaListener(topics = "datagen_users", containerFactory = "manualListenerContainerFactory")
  //  public void consume(ConsumerRecords<String,Users> records) {
  public void consume(ConsumerRecords<String,Users> records, Acknowledgment ack) {
    records.forEach(record -> {
      if (getRandomNumberInRange(1, 3) == 1) {
        ack.nack(0, Duration.ofSeconds(1));
        throw new RuntimeException("error!");
      }
       ack.acknowledge();
      log.info("Record: {}, offset: {}, partition: {}", record);
    }
    );
  }

  // @DltHandler
  // public void dlt(ConsumerRecord<String,Users> record) {
  //   log.info("record with offset: {}, sent to DLT", record);
  // }

  private static int getRandomNumberInRange(int min, int max) {

    if (min >= max) {
      throw new IllegalArgumentException("max must be greater than min");
    }

    Random r = new Random();
    return r.nextInt((max - min) + 1) + min;
  }
}
