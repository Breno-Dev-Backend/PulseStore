package com.PulseStore.PulseStore.repositories;

import com.PulseStore.PulseStore.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
