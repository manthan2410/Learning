package com.example.SpringBean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Teacher implements InitializingBean , DisposableBean {

    Teacher()
    {
       System.out.println("Bean  Teacher constructor working");
    }

    public void destroy()
    {
        System.out.println("Bean Teacher Destruction working");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean Teacher Initialization working");
    }
}
