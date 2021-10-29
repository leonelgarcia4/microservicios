package com.tutorial.productos.client;

import org.springframework.stereotype.Component;

@Component
public class PagosHystrixFallbackFactory implements PagosClient{

    @Override
    public String home() {
        return "none";
    }
    
}
