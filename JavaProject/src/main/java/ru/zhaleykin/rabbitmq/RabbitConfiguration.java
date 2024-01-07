package ru.zhaleykin.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class RabbitConfiguration {
    //объявляем очередь с именем queue1
    @Bean
    public Queue myQueue() {
        return new Queue("myQueue");
    }
}

