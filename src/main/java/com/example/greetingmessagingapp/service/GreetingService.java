package com.example.greetingmessagingapp.service;

import com.example.greetingmessagingapp.entity.Greeting;
import com.example.greetingmessagingapp.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreetingService implements IGreetingService{
    @Autowired
    GreetingAppRepository greetingRepo;
    public Greeting addGreeting(Greeting greets){
        return greetingRepo.save(greets);
    }
    public Optional<Greeting> findGreetingID(int id){
        return greetingRepo.findById(id);
    }
    public void deleteGreetingID(int id){
        greetingAppRepository.deleteById(id);
    }
}