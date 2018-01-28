package com.gmail.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getGermanGreeting() {
        return "Hallo!!! - Primäre Begrüßung";
    }

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola!!! - Saludo primario";
    }
}
