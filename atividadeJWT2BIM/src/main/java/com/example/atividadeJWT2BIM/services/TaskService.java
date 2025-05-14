package com.example.atividadeJWT2BIM.services;

import com.example.atividadeJWT2BIM.model.Task;
import com.example.atividadeJWT2BIM.repositories.TaskRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private TaskRepository repository;

    public Task create(Task task) {
        return repository.save(task);
    }

    public List<Task> findAll(){
        return repository.findAll();
    }

    public Task update(Long id, Task task){
        Task taskFound = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Not Found!"));
        taskFound.setStatus(task.getStatus());

        return repository.save(taskFound);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
