package com.example.demojpatransaction.service;

import com.example.demojpatransaction.mapper.PostMapper;
import com.example.demojpatransaction.model.PostDto;
import com.example.demojpatransaction.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostMapper postMapper;
    private final PostRepository postRepository;

    public PostService(PostMapper postMapper, PostRepository postRepository) {
        this.postMapper = postMapper;
        this.postRepository = postRepository;
    }

    public PostDto create(PostDto post) {
        return this.postMapper.toDto(this.postRepository.save(this.postMapper.toEntity(post)));
    }

    public PostDto findById(Long id) {
        return this.postMapper.toDto(this.postRepository.findPostById(id));
    }

    public List<PostDto> findAll() {
        return this.postMapper.toDtoList(this.postRepository.findAll());
    }

    public int add(int a, int b) {
        return a + b;
    }
}
