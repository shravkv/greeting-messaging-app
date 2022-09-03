package com.example.greetingmessagingapp.repository;

import com.bridgelabz.greetingapp.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingAppRepository extends JpaRepository<Greeting,Integer> {

}
