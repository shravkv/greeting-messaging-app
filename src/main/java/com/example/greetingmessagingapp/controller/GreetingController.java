package com.example.greetingmessagingapp.controller;

import com.example.greetingmessagingapp.dto.GreetingUserDto;
import com.example.greetingmessagingapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    public IGreetingService greetingService;


    @GetMapping(value = {"/greeting", "/greeting/home"})
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @GetMapping("greeting/service")
    public Greeting greeting() {
        return greetingService.greetingMessage();
    }

    @PostMapping("/post/greeting")
    private GreetingAppDto greeting(@RequestBody GreetingUserDto greetingUserDTO) {
        return greetingService.greetingMessageByName(greetingUserDTO);
    }

    @GetMapping("/find")
    public Optional<Greeting> greetById(@PathVariable long id) {
        return greetingService.getById(id);
    }

    @GetMapping("/findAll")
    public List<Greeting> findAllGreeting(){
        return greets.findAllGreets();
    }

    @PutMapping("editmessage/{id}")
    public GreetingAppModel editMessage(@PathVariable long id ,@RequestBody GreetingAppDTO greetingAppDTO){
        return greetingAppService.editMessage(id,greetingAppDTO);
    }

}