package com.geekstyle.springwebfluxdemo.controller;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class TestController {
	
	 @GetMapping("/hello/{latency}")
     public Mono<String> hello(@PathVariable int latency) {
         return Mono.just("Welcome to reactive world ~")
                 .delayElement(Duration.ofMillis(latency)); // 1
     }
	
}
