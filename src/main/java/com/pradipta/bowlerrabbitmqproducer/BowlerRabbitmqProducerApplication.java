package com.pradipta.bowlerrabbitmqproducer;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class BowlerRabbitmqProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BowlerRabbitmqProducerApplication.class, args);
    }

}
