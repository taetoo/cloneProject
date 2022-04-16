package com.clone.cloneproject.repository;

import com.clone.cloneproject.domain.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentsRepository extends JpaRepository<Comments,Long> {

}
