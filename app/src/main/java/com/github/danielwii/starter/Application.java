package com.github.danielwii.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@SpringBootApplication
public class Application {

    @RequestMapping
    public ResponseEntity index() {
        return ResponseEntity.ok(new Date());
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
