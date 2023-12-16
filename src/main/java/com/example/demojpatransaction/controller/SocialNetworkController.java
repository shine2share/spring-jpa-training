package com.example.demojpatransaction.controller;

import com.example.demojpatransaction.exception.BusinessException;
import com.example.demojpatransaction.model.SocialNetworkDto;
import com.example.demojpatransaction.service.SocialNetworkService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/social-network")
public class SocialNetworkController {
    private final SocialNetworkService socialNetworkService;

    public SocialNetworkController(SocialNetworkService socialNetworkService) {
        this.socialNetworkService = socialNetworkService;
    }

    @PostMapping("/v1/create")
    public ResponseEntity<String> create(@RequestBody SocialNetworkDto socialNetwork) throws BusinessException {
        return ResponseEntity.ok(this.socialNetworkService.create(socialNetwork));
    }
}
