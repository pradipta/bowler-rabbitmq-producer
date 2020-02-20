package com.pradipta.bowlerrabbitmqproducer.rabbitmq.producer;

import com.google.gson.Gson;
import com.pradipta.bowlerrabbitmqproducer.constants.Constants;
import com.pradipta.bowlerrabbitmqproducer.dto.OrderRequest;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class ProducerController {

    private final RabbitTemplate exchangeRabbitTemplate;
    private Gson gson = new Gson();

    @GetMapping("/hello")
    public String getHello(){
        return "Hello";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/sendmessage/topic")
    public String sendTopicMessage(@RequestBody OrderRequest orderRequest){
        String jsonMessage = gson.toJson(orderRequest);
        exchangeRabbitTemplate.convertAndSend(Constants.TOPIC_EXCHANGE, Constants.TOPIC_ROUTING_KEY, orderRequest);
        return "Message: \""+jsonMessage+"\"\n has been sent via topic exchange";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/sendmessage/direct")
    public String sendDirectMessage(@RequestBody OrderRequest orderRequest){
        String jsonMessage = gson.toJson(orderRequest);
        exchangeRabbitTemplate.convertAndSend(Constants.DIRECT_EXCHANGE, Constants.DIRECT_ROUTING_KEY, orderRequest);
        return "Message: \""+jsonMessage+"\"\n has been sent via direct exchange";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/sendmessage/fanout")
    public String sendFanoutMessage(@RequestBody OrderRequest orderRequest){
        String jsonMessage = gson.toJson(orderRequest);
        exchangeRabbitTemplate.convertAndSend(Constants.FANOUT_EXCHANGE, Constants.FANOUT_ROUTING_KEY, orderRequest);
        return "Message: \""+jsonMessage+"\"\n has been sent via fanout exchange";
    }
}
