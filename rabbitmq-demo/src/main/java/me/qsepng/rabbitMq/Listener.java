package me.qsepng.rabbitMq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class Listener {
    @RabbitHandler
    public void process(String context) {
        System.out.println("Receiver: " + context);
    }
}
