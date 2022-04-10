package com.example.springrestapi.service;
import com.example.springrestapi.entity.Order;
import com.example.springrestapi.repo.Orderrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Orderservice {

    @Autowired

    private Orderrepo repository;

    public List<Order> saveorders(List<Order> orders) {
        return repository.saveAll(orders);
    }
        public Order getByOrderid(int order_id) {
            return repository.findById(order_id).orElse(null) ;
    }

}
