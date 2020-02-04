package com.pradipta.bowlerrabbitmqproducer.rabbitmq.producer.fanoutQueueProducer;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class ConfigureFanoutProducer {

    public static final String FANOUT_QUEUE_1 = "pradipta.bowlerfanoutqueue1";
    public static final String FANOUT_QUEUE_2 = "pradipta.bowlerfanoutqueue2";
    public static final String FANOUT_QUEUE_3 = "pradipta.bowlerfanoutqueue3";
    public static final String FANOUT_EXCHANGE = "pradipta.bowlerfanoutexchange";
    public static final String FANOUT_ROUTING_KEY = "pradipta.bowlerfanoutkey";

//    public List<Queue> listQueue = new ArrayList<>();
//    public List<Binding> listOfBinds = new ArrayList<>();

    @Bean
    @Qualifier("FanoutQueue1")
    protected Queue createFanoutQueue1() {
        return new Queue(FANOUT_QUEUE_1, true);
    }

    @Bean
    @Qualifier("FanoutQueue2")
    protected Queue createFanoutQueue2() {
        return new Queue(FANOUT_QUEUE_2, true);
    }

    @Bean
    @Qualifier("FanoutQueue3")
    protected Queue createFanoutQueue3() {
        return new Queue(FANOUT_QUEUE_3, true);
    }

    @Bean
    FanoutExchange createFanoutExchange() {
        return new FanoutExchange(FANOUT_EXCHANGE);
    }

    //TODO: Try to find way so that we need not run Bind multiple times.

    @Bean
    @Qualifier("FanoutQueueBinding1")
    Binding bindFanout1(@Qualifier("FanoutQueue1") Queue q, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(q).to(fanoutExchange);
    }

    @Bean
    @Qualifier("FanoutQueueBinding2")
    Binding bindFanout2(@Qualifier("FanoutQueue2") Queue q, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(q).to(fanoutExchange);
    }

    @Bean
    @Qualifier("FanoutQueueBinding1")
    Binding bindFanout3(@Qualifier("FanoutQueue3") Queue q, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(q).to(fanoutExchange);
    }

}

