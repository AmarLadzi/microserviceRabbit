package com.world_presse_consumer.world_consumer.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.*;
import org.springframework.amqp.rabbit.core.*;
import org.springframework.amqp.support.converter.*;
import org.springframework.context.annotation.*;

import java.util.*;

@Configuration
public class RabbitConfiguration {
    public static final String QUEUE = "news_queue";
    public static final String EXCHANGE = "news_exchange";
    public static final String ROUTING_KEY = "news_routingKey";
//
//    @Bean
//    public Queue queue() {
//        return new Queue(QUEUE);
//    }

//    @Bean
//    public TopicExchange exchange() {
//        return new TopicExchange(EXCHANGE);
//    }
//
//    @Bean
//    public Binding binding(Queue queue, TopicExchange exchange) {
//        return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY);
//    }
//
//    @Bean
//    public MessageConverter converter() {
//        return new Jackson2JsonMessageConverter();
//    }
//
//    @Bean
//    public AmqpTemplate template(ConnectionFactory connectionFactory) {
//        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
//        rabbitTemplate.setMessageConverter(converter());
//        return rabbitTemplate;
//    }
}
