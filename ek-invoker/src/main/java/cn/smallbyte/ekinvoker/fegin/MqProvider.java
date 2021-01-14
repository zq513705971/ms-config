package cn.smallbyte.ekinvoker.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.smallbyte.ekinvoker.fallback.MqProviderFallback;

@FeignClient(name = "ms-mq", fallback = MqProviderFallback.class)
public interface MqProvider {
    @RequestMapping(value = "/mq/send/{msg}", method = RequestMethod.GET)
    public String sendMsg(@PathVariable(value = "msg") String msg);
}
