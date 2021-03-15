package com.world_presse_producer.worl_producer.component;

import com.world_presse_producer.worl_producer.config.*;
import org.springframework.amqp.rabbit.core.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.scheduling.annotation.*;
import org.springframework.stereotype.*;

@Component
public class Producer {

    @Autowired
    private RabbitTemplate template;
//    public Producer(RabbitTemplate template) {
//        this.template = template;
//    }

    Integer priority=100;

    @Scheduled(fixedRate = 1000)
    public void plusishMessage(){
        this.template.convertAndSend(RabbitConfiguration.EXCHANGE,
                RabbitConfiguration.ROUTING_KEY, new Article().toString());
    }

    //envoie d'un message avec une priorité
    @Scheduled(fixedRate = 5000)
    public void sendPriorityMessage() {
        String urgentMessage = "////////////////////////// EXPLOSION BEYROUTH /////////////////////////";
        template.convertAndSend(
                RabbitConfiguration.EXCHANGE,
                RabbitConfiguration.ROUTING_KEY,
                urgentMessage,
                message -> {
                    message.getMessageProperties().setPriority(priority);
                    return message;
                });

    }
}
