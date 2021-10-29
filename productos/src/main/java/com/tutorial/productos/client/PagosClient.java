package com.tutorial.productos.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "pagos-service", fallback = PagosHystrixFallbackFactory.class)
public interface PagosClient {
    
    @RequestMapping("/pagos/saludo")
    public String home();
}
