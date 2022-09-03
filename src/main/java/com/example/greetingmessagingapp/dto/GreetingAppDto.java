package com.example.greetingmessagingapp.dto;

import lombok.Data;

@Data
public class GreetingAppDto {

    private long id;
    private String message;

    public GreetingAppDto(long id, String message) {
        this.id = id;
        this.message = message;
    }
}
