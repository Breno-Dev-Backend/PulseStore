package com.PulseStore.PulseStore.repositories;

import com.PulseStore.PulseStore.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
