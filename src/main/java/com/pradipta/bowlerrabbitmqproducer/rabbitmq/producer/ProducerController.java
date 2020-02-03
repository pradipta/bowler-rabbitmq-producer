package com.pradipta.bowlerrabbitmqproducer.rabbitmq.producer;

import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ProducerController {
    private final RabbitTemplate rabbitTemplate;

    @RequestMapping(method = RequestMethod.POST, value = "/sendmessage/topic")
    public String sendTopicMessage(){
        return "ABCD";
    }
}
