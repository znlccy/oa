package com.youda.oa.provider;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*@Component*/
public class MyProvider {

    /*@Autowired
    AmqpTemplate amqpTemplate;

    public void send() {
        //1. 交换器的名称 2. Routing key 3. Msg
        amqpTemplate.convertAndSend("", "FIRST_QUEUE", "------- a direct message");

        amqpTemplate.convertAndSend("TOPIC_EXCHANGE", "shanghai.gupao.teacher", "------- a direct message shanghai.gupao.teacher");
        amqpTemplate.convertAndSend("TOPIC_EXCHANGE", "hefei.gupao.student", "------- a direct message hefei.gupao.student");

        amqpTemplate.convertAndSend("FANOUT_EXCHANGE", "", "------- a fanout message");
    }*/
}
