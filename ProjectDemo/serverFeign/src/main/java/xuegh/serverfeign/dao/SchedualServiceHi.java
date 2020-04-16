package xuegh.serverfeign.dao;

import org.springframework.cloud.netflix.feign.FeignClient;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import xuegh.serverfeign.impl.Rongduan;


@FeignClient(value = "service-client",fallback = Rongduan.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    String feignOne(@RequestParam(value = "name") String name);
}
