package com.example.demojpatransaction.controller;

import com.example.demojpatransaction.model.PostDto;
import com.example.demojpatransaction.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping(value = "/v1/save")
    public ResponseEntity<PostDto> create(@RequestBody PostDto post) {
        return ResponseEntity.ok(this.postService.create(post));
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<PostDto> find(@PathVariable Long id) {
        return ResponseEntity.ok(this.postService.findById(id));
    }

    @GetMapping("/find-all")
    public ResponseEntity<List<PostDto>> findAll() {
        return ResponseEntity.ok(this.postService.findAll());
    }

    @GetMapping("/add")
    public ResponseEntity<Integer> add() {
        return ResponseEntity.ok(this.postService.add(1,2));
    }
}
