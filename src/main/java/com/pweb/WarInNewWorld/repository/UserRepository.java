package com.pweb.WarInNewWorld.repository;

import com.pweb.WarInNewWorld.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
