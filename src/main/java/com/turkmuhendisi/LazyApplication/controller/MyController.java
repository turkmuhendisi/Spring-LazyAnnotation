package com.turkmuhendisi.LazyApplication.controller;

import com.turkmuhendisi.LazyApplication.Example1;
import com.turkmuhendisi.LazyApplication.Example2;
import com.turkmuhendisi.LazyApplication.MyComponent;
import com.turkmuhendisi.LazyApplication.config.MyConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
    @Autowired
    @Lazy
    private MyComponent myComponent;


    private Example1 example1;
//    @Autowired
//    private Example2 example2;

    private MyConfiguration myConfiguration;

//    @Autowired
//    public MyController(@Lazy MyComponent myComponent) {
//        this.myComponent = myComponent;
//    }
//
//    public MyController(MyConfiguration myConfiguration) {
//        this.myConfiguration = myConfiguration;
//    }
//
//
//    public MyController(MyComponent myComponent, Example1 example1) {
//        this.myComponent = myComponent;
//        this.example1 = example1;
//    }

    @GetMapping("/name")
    public String getComponentName() {
        return myComponent.getName();
    }

}
