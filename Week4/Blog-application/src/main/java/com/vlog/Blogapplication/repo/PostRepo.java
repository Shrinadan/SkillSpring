package com.vlog.Blogapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vlog.Blogapplication.model.Post;

public interface PostRepo  extends JpaRepository<Post, Integer>{

}
