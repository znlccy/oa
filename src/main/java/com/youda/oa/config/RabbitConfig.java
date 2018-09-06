package com.youda.oa.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*@Configuration*/
public class RabbitConfig {

    /*//定义两个交换机
    @Bean("topicExchange")
    public TopicExchange getToppicExchange() {
        return new TopicExchange("TOPIC_EXCHANGE");
    }

    @Bean("fanoutExchange")
    public FanoutExchange getFanoutExchange() {
        return new FanoutExchange("FANOUT_EXCHANGE");
    }

    //定义三个队列
    @Bean("firstQueue")
    public Queue getFirstQueue() {
        return  new Queue("FIRST_QUEUE");
    }

    @Bean("secondQueue")
    public Queue getSecondQueue() {
        return new Queue("SECOND_QUEUE");
    }

    @Bean("thirdQueue")
    public Queue getThirdQueue() {
        return new Queue("THIRD_QUEUE");
    }

    //定义两个绑定关系
    @Bean
    public Binding bindSecond(@Qualifier("secondQueue") Queue queue, @Qualifier("topicExchange") TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with("#.gupao.#");
    }

    @Bean
    public Binding bindThird(@Qualifier("thirdQueue") Queue queue, @Qualifier("fanoutExchange") FanoutExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange);
    }*/
}
