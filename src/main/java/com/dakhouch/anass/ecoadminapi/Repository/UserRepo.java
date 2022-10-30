package com.dakhouch.anass.ecoadminapi.Repository;

import com.dakhouch.anass.ecoadminapi.Model.Authentification.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, String> {
        Optional<User> findByUsername(String username);
        Boolean existsByUsername(String username);
}
