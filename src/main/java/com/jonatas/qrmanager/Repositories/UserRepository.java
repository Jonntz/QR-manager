package com.jonatas.qrmanager.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonatas.qrmanager.Entities.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);
}
