package com.example.demojpatransaction.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class NoTransactionService {
    public int add(int a, int b) {
        return a + b;
    }
}
