package com.pradipta.bowlerrabbitmqproducer.rabbitmq;

import lombok.Getter;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigureRabbitMQ {

    public static final String TOPIC_QUEUE = "pradipta.bowlertopicqueue";
    public static final String TOPIC_EXCHANGE = "pradipta.bowlertopicexchange";
    public static final String TOPIC_ROUTING_KEY = "pradipta.bowlertopickey";

    @Bean
    Queue createTopicQueue(){
        return new Queue(TOPIC_QUEUE, true);
    }

    @Bean
    TopicExchange createTopicExchange(){
        return new TopicExchange(TOPIC_EXCHANGE);
    }

    @Bean
    Binding bind(Queue q, TopicExchange topicExchange){
        return BindingBuilder.bind(q).to(topicExchange).with(TOPIC_ROUTING_KEY);
    }
}

