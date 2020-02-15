package com.pradipta.bowlerrabbitmqproducer.rabbitmq.producer;

import com.google.gson.Gson;
import com.pradipta.bowlerrabbitmqproducer.dto.OrderRequest;
import com.pradipta.bowlerrabbitmqproducer.rabbitmq.producer.directQueueProducer.ConfigureDirectRabbitMQ;
import com.pradipta.bowlerrabbitmqproducer.rabbitmq.producer.fanoutQueueProducer.ConfigureFanoutProducer;
import com.pradipta.bowlerrabbitmqproducer.rabbitmq.producer.topicQueueProducer.ConfigureTopicRabbitMQ;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class ProducerController {
    private final RabbitTemplate rabbitTemplate;

    @GetMapping("/hello")
    public String getHello(){
        return "Hello";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/sendmessage/topic")
    public String sendTopicMessage(@RequestBody OrderRequest orderRequest){
        Gson gson = new Gson();
        String jsonMessage = gson.toJson(orderRequest);
        rabbitTemplate.convertAndSend(ConfigureTopicRabbitMQ.TOPIC_EXCHANGE, ConfigureTopicRabbitMQ.TOPIC_ROUTING_KEY, jsonMessage);
        return "Message: \""+jsonMessage+"\"\n has been sent via topic exchange";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/sendmessage/direct")
    public String sendDirectMessage(@RequestBody OrderRequest orderRequest){
        Gson gson = new Gson();
        String jsonMessage = gson.toJson(orderRequest);
        rabbitTemplate.convertAndSend(ConfigureDirectRabbitMQ.DIRECT_EXCHANGE, ConfigureDirectRabbitMQ.DIRECT_ROUTING_KEY, jsonMessage);
        return "Message: \""+jsonMessage+"\"\n has been sent via direct exchange";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/sendmessage/fanout")
    public String sendFanoutMessage(@RequestBody OrderRequest orderRequest){
        Gson gson = new Gson();
        String jsonMessage = gson.toJson(orderRequest);
        rabbitTemplate.convertAndSend(ConfigureFanoutProducer.FANOUT_EXCHANGE, ConfigureFanoutProducer.FANOUT_ROUTING_KEY, jsonMessage);
        return "Message: \""+jsonMessage+"\"\n has been sent via fanout exchange";
    }
}
