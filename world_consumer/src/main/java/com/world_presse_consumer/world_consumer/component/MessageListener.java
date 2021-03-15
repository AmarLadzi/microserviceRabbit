package com.world_presse_consumer.world_consumer.component;

import com.world_presse_consumer.world_consumer.config.*;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.*;

@Component
public class MessageListener {

    @RabbitListener(queues= RabbitConfiguration.QUEUE)
    public void listener(Message article) throws InterruptedException {
        articleTranslation(article);
        System.out.println(article);
    }

    public void articleTranslation(Message article) throws InterruptedException {
        //supposer une traduction de l'article
        //...
        //...
        //...
        Thread.sleep(4000);
    }

}
