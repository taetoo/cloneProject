package com.clone.cloneproject.repository;

import com.clone.cloneproject.domain.Likes;
import com.clone.cloneproject.domain.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LikesRepository extends JpaRepository<Likes,Long> {

    Optional<Likes> findLikesByIdAndPosts_Id(Long id, Long  postId);
    Long deleteLikesById(Long id);

}
