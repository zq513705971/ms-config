package cn.smallbyte.msmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.smallbyte.msmq.service.MQSender;

@RestController
public class MQController {
    @Autowired
    private MQSender mqSender;

    @GetMapping("/mq/send/{msg}")
    public @ResponseBody void sendMsg(@PathVariable("msg") String msg) {
        mqSender.send(msg);
    }
}