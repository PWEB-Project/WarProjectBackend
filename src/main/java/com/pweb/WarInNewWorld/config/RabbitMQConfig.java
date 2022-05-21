package com.pweb.WarInNewWorld.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    @Bean
    public Queue createQueue() {
        return new Queue("mailQueue");
    }

    @Bean
    public Binding createBindingBetweenQueueAndMqttTopic() {
        return new Binding("mailQueue", Binding.DestinationType.QUEUE, "amq.topic", "bindingKey", null);
    }
}
