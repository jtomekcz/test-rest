package com.tomek.testrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TestRestApplication {

  public static void main(String[] args) {
    SpringApplication.run(TestRestApplication.class, args);
  }

  @RestController
  class Controller {

    @GetMapping("/test")
    public String test() {
      return "test of rest_test";
    }
  }

}
