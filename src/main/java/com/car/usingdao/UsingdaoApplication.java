package com.car.usingdao; //Base Package

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableJpaAuditing
@SpringBootApplication
public class UsingdaoApplication extends SpringBootServletInitializer {

    public static void main(String[] args)
    {
        System.out.println(" Inside the CARS driver class. ");
        SpringApplication.run(UsingdaoApplication.class, args);
    }

    /*@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
       return super.configure(builder);
        //return builder.sources(UsingdaoApplication.class);
    }*/
}
