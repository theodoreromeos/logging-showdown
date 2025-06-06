package com.theodore.logexample.controller;

import com.theodore.logexample.services.LoggingTestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logging")
public class LoggingTestController {

    private final LoggingTestService loggingTestService;

    public LoggingTestController(LoggingTestService loggingTestService) {
        this.loggingTestService = loggingTestService;
    }

    @GetMapping
    public ResponseEntity<String> loggingTest() {
        String response = loggingTestService.loggingTest();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
