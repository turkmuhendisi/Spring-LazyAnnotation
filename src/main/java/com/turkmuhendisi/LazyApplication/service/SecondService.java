package com.turkmuhendisi.LazyApplication.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class SecondService {
    private FirstService firstService;

    public SecondService(FirstService firstService) {
        this.firstService = firstService;
    }
}
