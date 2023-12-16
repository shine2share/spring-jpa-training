package com.example.demojpatransaction.model;

public class SocialNetworkDto {
    private PostDto post;
    private PostCommentDto postComment;

    public PostDto getPost() {
        return post;
    }

    public void setPost(PostDto post) {
        this.post = post;
    }

    public PostCommentDto getPostComment() {
        return postComment;
    }

    public void setPostComment(PostCommentDto postComment) {
        this.postComment = postComment;
    }
}
