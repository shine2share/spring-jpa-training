package com.example.demojpatransaction.repository;

import com.example.demojpatransaction.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    Post findPostById(Long id);
}
