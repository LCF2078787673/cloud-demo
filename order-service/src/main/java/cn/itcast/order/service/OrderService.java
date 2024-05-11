package cn.itcast.order.service;

import cn.itcast.demo.pojo.User;
import cn.itcast.order.mapper.OrderMapper;
import cn.itcast.demo.client.UserClient;
import cn.itcast.order.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

//    @Autowired
//    private RestTemplate restTemplate;
    @Autowired
    private UserClient userClient;
@GetMapping("{orderId}")
    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);
        //TODO 2.查询用户
//        String url = "http://userservice/user/"+ order.getUserId();
//        User user = restTemplate.getForObject(url,User.class);
    //第四步，改造"http://userservice/user/"
        User user = userClient.findById(order.getUserId());
        //封装user信息
        order.setUser(user);
        // 4.返回
        return order;
    }
}
