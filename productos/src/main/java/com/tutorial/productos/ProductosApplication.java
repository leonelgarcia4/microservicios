package com.tutorial.productos;

import com.tutorial.productos.client.PagosClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
public class ProductosApplication {

	@Autowired
	PagosClient pagosClient;

	@RequestMapping("/")
    public String home() {
		String saludo;
		saludo = "Hellow " + pagosClient.home();
        return saludo;
    }

	public static void main(String[] args) {
		SpringApplication.run(ProductosApplication.class, args);
	}

}
