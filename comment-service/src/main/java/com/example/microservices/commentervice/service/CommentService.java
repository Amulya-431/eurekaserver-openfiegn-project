package com.example.microservices.commentervice.service;


import java.util.List;

import com.example.microservices.commentervice.model.Comments;

public interface CommentService {
	
	public List<Comments> showAllComments();
	public Comments addComment(Comments comment);
	public List<Comments> getAllCommentsByPid(int pid);

}
