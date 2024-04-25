package com.example.goodbye;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class GoodbyeController {

@GetMapping("/saygoodbye")
  public String sayGoodbye() {
    return "goodbye!";
  }
}