package com.clone.cloneproject.service;

import com.clone.cloneproject.config.UserDetailsImpl;
import com.clone.cloneproject.domain.Likes;
import com.clone.cloneproject.domain.Posts;
import com.clone.cloneproject.domain.User;
import com.clone.cloneproject.repository.LikesRepository;
import com.clone.cloneproject.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LikesService {

    private final LikesRepository likesRepository;
    private final PostsRepository postsRepository;


    @Autowired
    public LikesService(LikesRepository likesRepository, PostsRepository postsRepository) {
        this.likesRepository = likesRepository;
        this.postsRepository = postsRepository;

    }

    //좋아요
    public boolean likePost(Long postId, UserDetailsImpl userDetails) {


     // user찾기

        User user = userDetails.getUser();

        //post 존재여부 확인
        Posts post  = postsRepository.findById(postId).orElseThrow(() -> new NullPointerException("게시물이 존재하지 않습니다."));


        Optional<Likes> click = likesRepository.findLikesByUserAndPostsId(user,postId);

        if(click.isPresent()){
            //좋아요 취소
            likesRepository.deleteLikesByUser(user);
            return false;
        } else{
            //좋아요 하기
            Likes likes = new Likes(post,user);
            likesRepository.save(likes);
            return true;
        }



    }
}
