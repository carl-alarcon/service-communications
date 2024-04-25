package com.example.hello;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "goodbye-service")
public interface GoodbyeClient {
  @GetMapping("/saygoodbye")
  String sayGoodbye();
}