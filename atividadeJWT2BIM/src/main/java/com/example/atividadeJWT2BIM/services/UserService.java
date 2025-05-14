package com.example.atividadeJWT2BIM.services;

import com.example.atividadeJWT2BIM.model.User;
import com.example.atividadeJWT2BIM.repositories.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private UserRepository repository;

    public User create(User user) {
        return repository.save(user);
    }

    public List<User> findAll(){
        return repository.findAll();
    }

    public User update(Long id, User user){
        User userFound = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Not Found!"));
        userFound.setUsername(user.getUsername());
        userFound.setPassword(user.getPassword());

        return repository.save(userFound);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
