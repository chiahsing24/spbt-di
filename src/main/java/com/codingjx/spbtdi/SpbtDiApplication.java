package com.codingjx.spbtdi;

import com.codingjx.spbtdi.controllers.ConstructorInjectedController;
import com.codingjx.spbtdi.controllers.MyController;
import com.codingjx.spbtdi.controllers.PropertyInjectedController;
import com.codingjx.spbtdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpbtDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpbtDiApplication.class, args);

        // Spring framework helps creating the instance of MyController.
        MyController myController = (MyController) ctx.getBean("myController");

        String greeting = myController.sayHello();

        System.out.println(greeting);

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
