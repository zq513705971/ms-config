package cn.smallbyte.ekinvoker.fallback;

import org.springframework.stereotype.Component;

import cn.smallbyte.ekinvoker.fegin.EkProvider;

@Component
public class EkProviderFallback implements EkProvider {

    @Override
    public String hello(String name) {
        // TODO Auto-generated method stub
        return "hello fallback";
    }

}
