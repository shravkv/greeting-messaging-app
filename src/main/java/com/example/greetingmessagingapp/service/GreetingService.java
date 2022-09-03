package com.example.greetingmessagingapp.service;

import com.example.greetingmessagingapp.dto.GreetingAppDto;
import com.example.greetingmessagingapp.dto.GreetingUserDto;
import com.example.greetingmessagingapp.entity.Greeting;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.concurrent.atomic.AtomicLong;

@Service

public class GreetingService  implements IGreetingService {

    @Autowired
    private static final String template = "Hello world!";
    private final AtomicLong counter = new AtomicLong();

    @Override
    public Greeting greetingMessage() {
        return new Greeting(counter.incrementAndGet(), String.format(template));
    }

    @Override
    public GreetingAppDto greetingMessageByName(GreetingUserDto greetingUserDto) {
        return new GreetingAppDto(counter.IncrementAndGet(), String.format(template, greetingUserDto.getFirstName()) + " " + greetingUserDto.getLastName());

    }

    @Override
    public Optional<Greeting> getById(long id) {
        Optional<Greeting> greetById = greetingAppRepository.findById((int) id);
        if (greetById.isPresent()) {
            return greetById;
        } else
            throw new RuntimeException();
    }
}
