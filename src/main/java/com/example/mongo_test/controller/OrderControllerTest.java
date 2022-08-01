package com.example.mongo_test.controller;

import com.example.mongo_test.domain.Order;
import com.example.mongo_test.repository.OrderRepository;
import com.example.mongo_test.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description: TODO
 * @Author: liuchang
 * @CreateTime: 2022-08-01  16:57
 */

@RestController
@RequestMapping("/ordertest")
public class OrderControllerTest {

    @Autowired
    private OrderService orderService;

    @PostMapping("/orderCreate")
    public void orderCreate(@RequestBody Order order) {
        orderService.save(order);
    }

    @GetMapping("/findAll")
    public List<Order> findAll() {
        List<Order> orderList = orderService.findAll();
        return orderList;
    }
}
