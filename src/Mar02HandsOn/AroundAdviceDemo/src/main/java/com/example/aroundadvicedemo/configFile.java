package com.example.aroundadvicedemo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.example.aroundadvicedemo")
public class configFile {

    public class myConfig {
    }
}

