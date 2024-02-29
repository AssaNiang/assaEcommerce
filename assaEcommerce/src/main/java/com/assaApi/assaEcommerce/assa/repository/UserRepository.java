package com.assaApi.assaEcommerce.assa.repository;

import com.assaApi.assaEcommerce.assa.enums.UserRole;
import com.assaApi.assaEcommerce.assa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    Optional<User> findByLastnameOrEmail(String lastname, String email);

    Optional<User> findByLastname(String lastname);

    Boolean existsByEmail(String email);

    Boolean existsByLastname(String lastname);

    List<User> findByUserRole(UserRole userRole);
}
