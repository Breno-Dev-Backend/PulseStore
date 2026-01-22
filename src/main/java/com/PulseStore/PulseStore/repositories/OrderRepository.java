package com.PulseStore.PulseStore.repositories;

import com.PulseStore.PulseStore.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
