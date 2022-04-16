package com.clone.cloneproject.repository;


import com.clone.cloneproject.domain.Likes;
import com.clone.cloneproject.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LikesRepository extends JpaRepository<Likes,Long> {

    Optional<Likes> findLikesByUserAndAndPosts(User user, Long id);
    void deleteLikesByUser(User user);

}
