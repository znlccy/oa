package com.youda.oa.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/*@Component
@RabbitListener(queues = "FIRST_QUEUE")*/
public class FirstComsumer {

    /*@RabbitHandler
    public void process(String msg) {
        System.out.println("first receive message" + msg);
    }*/
}
