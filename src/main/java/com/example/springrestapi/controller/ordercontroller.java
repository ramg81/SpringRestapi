package com.example.springrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.springrestapi.service.Orderservice;
import com.example.springrestapi.entity.Order;

import java.util.List;

@RestController
public class ordercontroller {

    @Autowired
    private Orderservice service1;

    @PostMapping("/addorders")
    public List<Order>addorders(@RequestBody List<Order> orders){

        return service1.saveorders(orders);
    }
    @GetMapping("/Orderbyid/{order_id}")
    public Order findByOrderId(@PathVariable int order_id) {
        return service1.getByOrderid(order_id);
    }


}
