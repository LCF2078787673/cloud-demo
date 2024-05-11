package cn.itcast.order.service;

import cn.itcast.order.config.HystrixConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "userservice",
        configuration = HystrixConfig.class,
        fallback = LocalItemServiceImpl.class)
public interface LocalItemService {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi(@RequestParam(value = "id")String id);
}


