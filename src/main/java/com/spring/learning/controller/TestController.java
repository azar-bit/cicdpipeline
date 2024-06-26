package com.spring.learning.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class TestController {

    @GetMapping
    public ResponseEntity<Map<String, String>> test() {
        return ResponseEntity.ok(Map.of("message", "|: Application up and Running :|"));
    }}
