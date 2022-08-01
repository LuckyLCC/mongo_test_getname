package com.example.mongo_test.service;


import com.example.mongo_test.domain.Order;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OrderService {
    List<Order> findAll();

    void save(Order order);
}
