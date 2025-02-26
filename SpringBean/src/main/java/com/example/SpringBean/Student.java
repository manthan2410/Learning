package com.example.SpringBean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Student {

    Student()
    {
       System.out.println("Bean constructor working");
    }
    @PostConstruct
    public void init()
    {
        System.out.println("Bean Initialization working");
    }
    @PreDestroy
    public void destroy()
    {
        System.out.println("Bean Destruction working");
    }
}
