package com.example.mongo_test.service;

import com.example.mongo_test.Utils.DomainUtils;
import com.example.mongo_test.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * @Description: TODO
 * @Author: liuchang
 * @CreateTime: 2022-08-01  17:02
 */
@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Order> findAll() {
        LocalDate now = LocalDate.now();
        List<Order> m_order_1 = mongoTemplate.findAll(Order.class, "m_order_"+now);
        return m_order_1;
    }

    @Override
    public void save(Order order) {
        LocalDate now = LocalDate.now();
        String tableName = DomainUtils.getTableName(Order.class);
        mongoTemplate.save(order, "m_order_"+now);
    }
}
