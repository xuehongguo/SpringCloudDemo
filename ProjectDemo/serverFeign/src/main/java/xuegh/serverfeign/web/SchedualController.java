package xuegh.serverfeign.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xuegh.serverfeign.dao.SchedualServiceHi;

import javax.annotation.Resource;


@RestController
public class SchedualController {


    //@Resource(name = "service-client")
    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @RequestMapping("/hi")
    public String feigntest(@RequestParam(value = "name") String name) {
        return schedualServiceHi.feignOne(name);
    }
}
