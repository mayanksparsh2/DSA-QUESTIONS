package com.example.aroundadvicedemo;

import com.example.aroundadvicedemo.dao.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//02/03/2022 AROUND ADVICE
@SpringBootApplication
public class MainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(configFile.class);

        MyService myService = context.getBean("myService", MyService.class);
        System.out.println("------------------------------------Executing MyMethod()------------------------------------");
        System.out.println(myService.myMethod());
        System.out.println("------------------------------------Finished Executing MyMethod()------------------------------------");

        context.close();
        System.out.println("Finished");
    }

}
