package com.example.microservices.dataservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.example.microservices.dataservice.dao.PostsDao;
import com.example.microservices.dataservice.model.Posts;

@DataJpaTest
public class PostsDaoTest {
	@Autowired
	TestEntityManager entityManager;
	
	@Autowired
	private PostsDao postsdao;
	
	
	@Test
	void testFindById()
	{
		Posts p1=new Posts(87,"amul","java","good");
		entityManager.persist(p1);
		Optional<Posts> p2 = Optional.of(new Posts(87,"amul","java","good"));
		Optional<Posts> posts = postsdao.findById(87);
		assertEquals(p2.get().getPid(),posts.get().getPid());
	}
	

}
