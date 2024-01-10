package com.turkmuhendisi.LazyApplication.config;

import com.turkmuhendisi.LazyApplication.Example1;
import com.turkmuhendisi.LazyApplication.Example2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class MyConfiguration {
    public MyConfiguration() {
        System.out.println("MyConfiguration bean initialized!");
    }

    @Bean
    public Example1 getExample1() {
        return new Example1();
    }

    @Bean
    public Example2 getExample2() {
        return new Example2();
    }
}
