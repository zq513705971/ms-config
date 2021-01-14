package cn.smallbyte.msmq.service;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "ms-mq")
public class MQReceiver {
    @RabbitHandler
    public void process(Object msg) {
        System.out.println(msg);
    }
}
