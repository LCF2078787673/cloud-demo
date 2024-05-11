package cn.itcast.order.service;

import cn.itcast.order.config.HystrixConfig;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import org.springframework.stereotype.Component;
@Component
public class LocalItemServiceImpl implements LocalItemService{
    @Override
    public String hi(String id) {
        return String.format("Hi，your message is : %s but request bad.",id);
    }
}

