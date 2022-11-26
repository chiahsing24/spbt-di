package com.codingjx.spbtdi.controllers;

import com.codingjx.spbtdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
