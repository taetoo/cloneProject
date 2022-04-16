package com.clone.cloneproject.repository;

import com.clone.cloneproject.domain.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts,Long> {
    List<Posts> findAllByOrderByModifiedAtDesc();



    @Transactional
    @Modifying
    @Query("update Posts m set m.likeCount = m.likeCount+1 where m.id = :id")
    int uplikeCount(Long id);

    @Transactional
    @Modifying
    @Query("update Posts m set m.likeCount = m.likeCount-1 where m.id = :id")
    int downlikeCount(Long id);


}
//