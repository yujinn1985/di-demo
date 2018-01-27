package com.gmail.myyujinn.controllers;

import com.gmail.myyujinn.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    /**
     * Also you can use the name of the property as the name of the bean
     * you want to inject instead of using @Qualifier annotations
     * i.e. greetingServiceImpl (GreetingServiceImpl), though not recommended
     * Besides it will autowire the @Primary annotated bean instead of the target
     */
    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }

}
