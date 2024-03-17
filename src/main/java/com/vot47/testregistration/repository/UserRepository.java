package com.vot47.testregistration.repository;

import com.vot47.testregistration.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
