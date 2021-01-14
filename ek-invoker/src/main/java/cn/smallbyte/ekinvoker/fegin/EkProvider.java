package cn.smallbyte.ekinvoker.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.smallbyte.ekinvoker.fallback.EkProviderFallback;

@FeignClient(name = "service-provider", fallback = EkProviderFallback.class)
public interface EkProvider {
    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable(value = "name") String name);
}
