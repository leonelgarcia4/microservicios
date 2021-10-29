package com.sitiapp.pagosservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/pagos")
public class PagosServiceApplication {

	@RequestMapping("/saludo")
    public String home() {
        return "World, desde pagos!";
    }

	public static void main(String[] args) {
		SpringApplication.run(PagosServiceApplication.class, args);
	}

}
