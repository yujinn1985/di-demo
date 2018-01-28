package com.gmail.myyujinn.controllers;

import com.gmail.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GetterInjectedController {

    private GreetingService greetingService;

    /**
     * Also you can use the @Qualifier annotations with the setter method declaration
     * in the setter based dependency injection
     */
    @Autowired
    //@Qualifier("getterGreetingService")
    public void setGreetingService(@Qualifier("getterGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
