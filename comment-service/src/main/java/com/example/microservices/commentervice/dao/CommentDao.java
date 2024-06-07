package com.example.microservices.commentervice.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.microservices.commentervice.model.Comments;


public interface CommentDao extends JpaRepository<Comments,Integer>{
	
	public List<Comments> findByPid(int pid);

}