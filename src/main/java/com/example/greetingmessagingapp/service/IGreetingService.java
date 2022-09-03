package com.example.greetingmessagingapp.service;

import com.bridgelabz.greetingapp.dto.GreetingUserDto;

import com.example.greetingmessagingapp.entity.Greeting;

import java.util.Optional;


public interface IGreetingService {

    Greeting greetingMessage();

    Greeting greetingMessageByName(GreetingUserDto greetingUserDto);

    Optional<Greeting> getById(long id);
}
