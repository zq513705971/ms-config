package cn.smallbyte.msmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.smallbyte.msmq.service.MQSender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqTest {
    @Autowired
    private MQSender mqSender;

    @Test
    public void sendMsg() throws Exception {
        mqSender.send("helloworld!");
    }
}
