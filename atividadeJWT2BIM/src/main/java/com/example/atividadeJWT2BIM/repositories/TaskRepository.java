package com.example.atividadeJWT2BIM.repositories;

import com.example.atividadeJWT2BIM.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
