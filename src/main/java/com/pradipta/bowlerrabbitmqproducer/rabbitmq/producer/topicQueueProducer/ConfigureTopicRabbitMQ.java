package com.pradipta.bowlerrabbitmqproducer.rabbitmq.producer.topicQueueProducer;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigureTopicRabbitMQ {

    public static final String TOPIC_QUEUE = "pradipta.bowlertopicqueue";
    public static final String TOPIC_EXCHANGE = "pradipta.bowlertopicexchange";
    public static final String TOPIC_ROUTING_KEY = "pradipta.bowlertopickey";

    @Bean
    @Qualifier("TopicQueue")
    protected Queue createTopicQueue(){
        return new Queue(TOPIC_QUEUE, true);
    }

    @Bean
    TopicExchange createTopicExchange(){
        return new TopicExchange(TOPIC_EXCHANGE);
    }

    @Bean
    @Qualifier("TopicQueueBinding")
    Binding bindTopic(@Qualifier("TopicQueue") Queue q, TopicExchange topicExchange){
        return BindingBuilder.bind(q).to(topicExchange).with(TOPIC_ROUTING_KEY);
    }
}

