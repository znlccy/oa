package com.youda.oa.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/*@Component
@RabbitListener(queues = "THIRD_QUEUE")*/
public class ThirdConsumer {

    /*@RabbitHandler
    public void process(String msg) {
        System.out.println("third receive message" + msg);
    }*/
}
