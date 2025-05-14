package com.example.atividadeJWT2BIM.repositories;

import com.example.atividadeJWT2BIM.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
