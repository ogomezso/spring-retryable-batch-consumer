package org.github.ogomezso.springretryablebatchconsumer.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "app")
@Data
public class AppConfig {
    private String topic;
    private Long retryFixedBackoff;
    private Integer retryMaxAttempts;
    private String schemaRegistryUrl;
}
