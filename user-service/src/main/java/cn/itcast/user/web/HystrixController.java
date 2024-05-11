package cn.itcast.user.web;

import org.springframework.web.bind.annotation.RequestMapping;

public class HystrixController {
    @RequestMapping("/hi")
    public String hi(String id){
        return "Hello World, I'm from hystix!"+id;
    }

}
