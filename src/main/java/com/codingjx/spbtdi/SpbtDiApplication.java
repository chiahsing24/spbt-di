package com.codingjx.spbtdi;

import com.codingjx.spbtdi.controllers.MyController;
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
    }

}
