package com.example.microservices.dataservice.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.microservices.dataservice.model.Posts;

@Repository
public interface PostsDao extends JpaRepository<Posts,Integer>{

}