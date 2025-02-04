package com.sparta.spring_auth.repository;

import com.sparta.spring_auth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username); // ** Optional은 NUll을 체크해준다.
    Optional<User> findByEmail(String email);

}
