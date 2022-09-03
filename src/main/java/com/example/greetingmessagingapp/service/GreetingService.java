package com.example.greetingmessagingapp.service;

import com.example.greetingmessagingapp.app.model.Greeting;
import com.example.greetingmessagingapp.app.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingService implements IGreetingService{
    @Autowired
    GreetingRepo greetingRepo;
    public Greeting addGreeting(Greeting greets){
        return greetingRepo.save(greets);
    }
    public Optional<Greeting> findGreetingID(int id){
        return greetingRepo.findById(id);
    }

    public List<Greeting> findAllGreets(){
        return greetingRepo.findAll();
    }
}
