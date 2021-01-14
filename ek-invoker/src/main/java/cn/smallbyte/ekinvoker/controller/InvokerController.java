package cn.smallbyte.ekinvoker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cn.smallbyte.ekinvoker.fegin.EkProvider;
import cn.smallbyte.ekinvoker.fegin.MqProvider;

@RestController
@Configuration
public class InvokerController {
    @Autowired
    private EkProvider ekProvider;
    @Autowired
    private MqProvider mqProvider;

    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @RequestMapping(value = "/ribbon/hello/{name}", method = RequestMethod.GET)
    public String ribbonHello(@PathVariable(value = "name") String name) {
        RestTemplate restTpl = getRestTemplate();
        // 根据应用名称调用服务
        String json = restTpl.getForEntity("http://service-provider/hello/" + name, String.class).getBody();
        return json;
    }

    @RequestMapping(value = "/fegin/hello/{name}", method = RequestMethod.GET)
    public String feginHello(@PathVariable(value = "name") String name) {
        return ekProvider.hello(name);
    }

    @RequestMapping(value = "/fegin/mq/send/{msg}", method = RequestMethod.GET)
    public String feginSendMsg(@PathVariable(value = "msg") String msg) {
        return mqProvider.sendMsg(msg);
    }
}
