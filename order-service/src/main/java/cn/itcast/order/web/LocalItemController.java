package cn.itcast.order.web;

import cn.itcast.order.config.HystrixConfig;
import cn.itcast.order.service.LocalItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalItemController {
    @Autowired
    LocalItemService localItemService;
    @GetMapping("/hi")
    public String hi(String id) {
        return localItemService.hi(id);
    }
}

