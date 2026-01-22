package com.PulseStore.PulseStore.services;

import com.PulseStore.PulseStore.entities.Order;
import com.PulseStore.PulseStore.entities.User;
import com.PulseStore.PulseStore.repositories.OrderRepository;
import com.PulseStore.PulseStore.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj  = repository.findById(id);
        return obj.get();
    }
}
