package com.example.demojpatransaction.controller;

import com.example.demojpatransaction.service.NoTransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/no-transaction")
public class NoTransactionController {
    private final NoTransactionService noTransactionService;

    public NoTransactionController(NoTransactionService noTransactionService) {
        this.noTransactionService = noTransactionService;
    }

    @GetMapping
    public int test() {
        return noTransactionService.add(1,2);
    }
}
