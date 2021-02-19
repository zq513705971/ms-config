package cn.smallbyte.msmq.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MQSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(Object msg) {
        this.rabbitTemplate.convertAndSend("ms-mq", msg);
    }
}
