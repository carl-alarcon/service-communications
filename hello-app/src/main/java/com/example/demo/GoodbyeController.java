package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloController {

  @Autowired
  GoodbyeClient goodbye;

  @GetMapping("/sayhello")
  public String sayHello() {
    return "Hello!";
  }
  
  @GetMapping("/saygoodbye")
  public String sayGoodbye() {
    return this.goodbye.sayGoodbye();
  }
}