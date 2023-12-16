package com.example.demojpatransaction.mapper;

import com.example.demojpatransaction.entity.PostComment;
import com.example.demojpatransaction.model.PostCommentDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PostCommentMapper extends ObjectMapper<PostComment, PostCommentDto> {
}
