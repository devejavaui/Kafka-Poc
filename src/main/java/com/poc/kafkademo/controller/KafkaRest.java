package com.poc.kafkademo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/hello")
public class KafkaRest {
    @GetMapping(path="/api/message/{message}")
public ResponseEntity<String> hello(@PathVariable String message) {

    return ResponseEntity.ok("Hello World");
        }
}
