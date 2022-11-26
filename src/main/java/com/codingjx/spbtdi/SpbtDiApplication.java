package com.codingjx.spbtdi;

import com.codingjx.spbtdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpbtDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpbtDiApplication.class, args);

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        // Spring framework helps creating the instance of MyController.
        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println("--------- Primary bean");

        System.out.println(myController.sayHello());

        System.out.println("--------- Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("--------- Setter");

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());

        System.out.println("--------- Controller");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());
    }

}
