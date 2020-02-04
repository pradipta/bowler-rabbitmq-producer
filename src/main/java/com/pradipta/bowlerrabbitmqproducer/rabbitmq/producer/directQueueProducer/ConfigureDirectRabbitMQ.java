package com.pradipta.bowlerrabbitmqproducer.rabbitmq.producer.directQueueProducer;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfigureDirectRabbitMQ {

    public static final String DIRECT_QUEUE = "pradipta.bowlerdirectqueue";
    public static final String DIRECT_EXCHANGE = "pradipta.bowlerdirectexchange";
    public static final String DIRECT_ROUTING_KEY = "pradipta.bowlerdirectkey";

    @Bean
    @Qualifier("DirectQueue")
    protected Queue createDirectQueue() {
        return new Queue(DIRECT_QUEUE, true);
    }

    @Bean
    DirectExchange createDirectExchange() {
        return new DirectExchange(DIRECT_EXCHANGE);
    }

    @Bean
    @Qualifier("DirectQueueBinding")
    Binding bindDirect(@Qualifier("DirectQueue") Queue q, DirectExchange directExchange){
        return BindingBuilder.bind(q).to(directExchange).with(DIRECT_ROUTING_KEY);
    }
}

