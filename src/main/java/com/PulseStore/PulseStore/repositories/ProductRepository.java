package com.PulseStore.PulseStore.repositories;

import com.PulseStore.PulseStore.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
