package com.assaApi.assaEcommerce.assa.repository;

import com.assaApi.assaEcommerce.assa.enums.UserRole;
import com.assaApi.assaEcommerce.assa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);

    Optional<User> findByUsername(String username);

    Boolean existsByEmail(String email);

    Boolean existsByUsername(String username);

    List<User> findByUserRole(UserRole userRole);
}
