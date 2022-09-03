package com.example.greetingmessagingapp.repository;

import com.example.greetingmessagingapp.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingAppRepository extends JpaRepository<Greeting,Integer> {

}
