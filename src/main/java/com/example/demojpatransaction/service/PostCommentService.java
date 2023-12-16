package com.example.demojpatransaction.service;

import com.example.demojpatransaction.mapper.PostCommentMapper;
import com.example.demojpatransaction.model.PostCommentDto;
import com.example.demojpatransaction.repository.PostCommentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PostCommentService {
    private final PostCommentMapper postCommentMapper;
    private final PostCommentRepository postCommentRepository;

    public PostCommentService(PostCommentMapper postCommentMapper, PostCommentRepository postCommentRepository) {
        this.postCommentMapper = postCommentMapper;
        this.postCommentRepository = postCommentRepository;
    }
    @Transactional
    public PostCommentDto create(PostCommentDto postComment) {
        return this.postCommentMapper.toDto(this.postCommentRepository.save(this.postCommentMapper.toEntity(postComment)));
    }
}
