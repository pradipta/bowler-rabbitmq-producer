package com.pradipta.bowlerrabbitmqproducer.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigureRabbitMQ {

    private final String TOPIC_QUEUE = "pradipta.topicqueue";
    private final String TOPIC_EXCHANGE = "pradipta.topicexchange";

    @Bean
    Queue createTopicQueue(){
        return new Queue(TOPIC_QUEUE, true);
    }

    @Bean TopicExchange createTopicExchange(){
        return new TopicExchange(TOPIC_EXCHANGE);
    }
}

