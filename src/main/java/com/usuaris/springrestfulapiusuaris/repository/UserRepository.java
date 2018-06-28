package com.usuaris.springrestfulapiusuaris.repository;

import com.usuaris.springrestfulapiusuaris.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
