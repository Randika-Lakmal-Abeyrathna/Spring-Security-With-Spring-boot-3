package com.randikalakmal.springsecurity.repository;

import com.randikalakmal.springsecurity.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserInfo,Integer> {
    Optional<UserInfo> findByName(String username);
}
