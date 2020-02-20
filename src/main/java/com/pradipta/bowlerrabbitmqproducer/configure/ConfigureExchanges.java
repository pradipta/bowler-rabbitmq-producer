package com.pradipta.bowlerrabbitmqproducer.configure;

import com.pradipta.bowlerrabbitmqproducer.constants.Constants;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigureExchanges {
    @Bean
    TopicExchange createTopicExchange(){
        return new TopicExchange(Constants.TOPIC_EXCHANGE);
    }

    @Bean
    DirectExchange createDirectExchange(){
        return new DirectExchange(Constants.DIRECT_EXCHANGE);
    }

    @Bean
    FanoutExchange createFanoutExchange(){
        return new FanoutExchange(Constants.FANOUT_EXCHANGE);
    }

    @Bean
    MessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public AmqpTemplate exchangeRabbitTemplate(ConnectionFactory connectionFactory, MessageConverter jsonMessageConverter) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(jsonMessageConverter);
        return rabbitTemplate;
    }
}
