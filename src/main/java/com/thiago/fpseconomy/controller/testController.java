package com.thiago.fpseconomy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/recursos")
public class testController {
    @PostMapping("/")
    public ResponseEntity<T> economyAnalize(@RequestBody String data) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
