package com.example.demojpatransaction.controller;

import com.example.demojpatransaction.model.PostCommentDto;
import com.example.demojpatransaction.service.PostCommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post-comment")
public class PostCommentController {
    private final PostCommentService postCommentService;

    public PostCommentController(PostCommentService postCommentService) {
        this.postCommentService = postCommentService;
    }

    @PostMapping("/v1/save")
    public ResponseEntity<PostCommentDto> create(@RequestBody PostCommentDto postComment) {
        return ResponseEntity.ok(this.postCommentService.create(postComment));
    }
}
