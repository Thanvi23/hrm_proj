package com.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping("/data")
    public ResponseEntity<?> getProtectedData() {
        return ResponseEntity.ok("You accessed protected data!");
    }
}