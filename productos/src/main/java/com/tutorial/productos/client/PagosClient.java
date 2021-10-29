package com.tutorial.productos.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("pagos-service")
public interface PagosClient {
    
    @RequestMapping("/pagos/saludo")
    public String home();
}
