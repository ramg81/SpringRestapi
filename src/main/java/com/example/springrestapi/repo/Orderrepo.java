package com.example.springrestapi.repo;
import com.example.springrestapi.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Orderrepo extends JpaRepository<Order,Integer> {

}
