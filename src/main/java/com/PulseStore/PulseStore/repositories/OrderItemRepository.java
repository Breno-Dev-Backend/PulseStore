package com.PulseStore.PulseStore.repositories;

import com.PulseStore.PulseStore.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
