package org.example.springsandbox.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableZuulProxy
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /*@Bean
    public SimpleFilter simpleFilter() {
        return new SimpleFilter();
    }*/
}
