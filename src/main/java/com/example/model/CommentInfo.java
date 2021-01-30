package com.example.model;

public class CommentInfo
{
    private int commentId;
    private String comment;

    public CommentInfo() {
    }

    public CommentInfo(int commentId, String comment) {
        this.commentId = commentId;
        this.comment = comment;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
