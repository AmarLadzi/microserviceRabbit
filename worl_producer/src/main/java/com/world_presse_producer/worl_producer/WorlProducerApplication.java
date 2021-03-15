package com.world_presse_producer.worl_producer;

import com.world_presse_producer.worl_producer.config.*;
import org.springframework.amqp.rabbit.core.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.*;

@SpringBootApplication
@EnableScheduling
public class WorlProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorlProducerApplication.class, args);
    }


//    @Bean
//    public ApplicationRunner runner(RabbitTemplate template) {
//        return args -> {
////            message.setMessageId(UUID.randomUUID().toString());
////            message.setMessageDate(new Date());
//
//
////            System.out.println("Message Published");
//        };
//    }

}
