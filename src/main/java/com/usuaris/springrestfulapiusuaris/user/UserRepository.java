package com.usuaris.springrestfulapiusuaris.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
    El mètode findByUsername() és utilitzat per la autenticació. A UserDetailService.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
