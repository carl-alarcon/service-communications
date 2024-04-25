package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
@EnableDiscoveryClient
@EnableFeignClients
public class HelloApplication {
  public static void main(final String[] args) {
    SpringApplication.run(HelloApplication.class, args);
  }
}