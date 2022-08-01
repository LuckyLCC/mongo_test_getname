package com.example.mongo_test.repository;

import com.example.mongo_test.domain.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepository extends MongoRepository<Order,String> {
}
