package com.github.paivajudson.Produtos.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProdutosDemoApplication {

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World!";
    }

	public static void main(String[] args) {
        SpringApplication.run(ProdutosDemoApplication.class, args);
	}
}
