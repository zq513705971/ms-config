package cn.smallbyte.ekinvoker.fallback;

import org.springframework.stereotype.Component;

import cn.smallbyte.ekinvoker.fegin.EkProvider;
import cn.smallbyte.ekinvoker.fegin.MqProvider;

@Component
public class MqProviderFallback implements MqProvider {

    @Override
    public String sendMsg(String msg) {
        // TODO Auto-generated method stub
        return "sendMsg fallback";
    }

}
