package com.example.demojpatransaction.service;

import com.example.demojpatransaction.model.SocialNetworkDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SocialNetworkService {
    private final PostService postService;
    private final PostCommentService postCommentService;

    public SocialNetworkService(PostService postService, PostCommentService postCommentService) {
        this.postService = postService;
        this.postCommentService = postCommentService;
    }

    @Transactional
    public String create(SocialNetworkDto socialNetwork) {
        this.postService.create(socialNetwork.getPost());
        this.postCommentService.create(socialNetwork.getPostComment());
        return "success";
    }
}
