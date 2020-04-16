package xuegh.serverfeign.impl;

import org.springframework.stereotype.Component;
import xuegh.serverfeign.dao.SchedualServiceHi;

@Component
public class Rongduan implements SchedualServiceHi {
    @Override
    public String feignOne(String name) {
        return "hi," + name + "      服务出错...";
    }
}
