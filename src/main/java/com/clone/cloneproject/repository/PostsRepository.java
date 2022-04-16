package com.clone.cloneproject.repository;

import com.clone.cloneproject.domain.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts,Long> {
    List<Posts> findAllByOrderByModifiedAtDesc();

}
//