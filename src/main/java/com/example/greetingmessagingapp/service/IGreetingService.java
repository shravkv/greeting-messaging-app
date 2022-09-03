package com.example.greetingmessagingapp.service;

import com.example.greetingmessagingapp.dto.GreetingUserDto;

import com.example.greetingmessagingapp.entity.Greeting;

import java.util.Optional;


public interface IGreetingService {

    Greeting greetingMessage();

    Greeting greetingMessageByName(GreetingUserDto greetingUserDto);

    Optional<Greeting> getById(long id);

    public List<Greeting> findAllGreets();

    Greeting editMessage(long id, GreetingAppDTO greetingAppDTO);
}
