package com.example.demojpatransaction.repository;

import com.example.demojpatransaction.entity.PostComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostCommentRepository extends JpaRepository<PostComment, Long> {
}
