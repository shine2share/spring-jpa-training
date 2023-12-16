package com.example.demojpatransaction.mapper;

import com.example.demojpatransaction.entity.Post;
import com.example.demojpatransaction.model.PostDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PostMapper extends ObjectMapper<Post, PostDto> {
}
