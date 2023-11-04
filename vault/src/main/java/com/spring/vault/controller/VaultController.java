package com.spring.vault.controller;

import com.spring.vault.configuration.Credentials;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VaultController {

    private final Credentials credentials;

    public VaultController(Credentials credentials) {
        this.credentials = credentials;
    }

    @GetMapping("/")
    public ResponseEntity<String> getCredentials() {
        System.out.println(credentials.getUsername());
        return ResponseEntity.ok(credentials.getUsername());
    }
}
