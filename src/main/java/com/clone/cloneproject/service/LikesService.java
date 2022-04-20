package com.clone.cloneproject.service;

import com.clone.cloneproject.config.UserDetailsImpl;
import com.clone.cloneproject.domain.Likes;
import com.clone.cloneproject.domain.Posts;
import com.clone.cloneproject.domain.User;
import com.clone.cloneproject.repository.LikesRepository;
import com.clone.cloneproject.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public boolean likePost(Long postId, UserDetailsImpl userDetails) {

        //로그인한 유저 찾아오자
        User user = userDetails.getUser();

        //post 존재여부 확인 -> 현재 게시글 1,2,3..
        Posts post  = postsRepository.findById(postId).orElseThrow(() -> new NullPointerException("게시물이 존재하지 않습니다."));


        //로그인한 유저 , 해당 게시글 pk로 좋아요 유무 확인
        //1번 게시글에서 유저가 좋아요 후 취소를 누름 ,
        Optional<Likes> click = likesRepository.findLikesByUserAndPostsId(user,postId);
        //조건에 해당하는 like 를 찾아온다.
        if(click.isPresent()){
            //클릭이 존재하니 , -> 1번 게시글의 정보와 클릭한 유저의 정보를 받아와 해당하는 좋아요를 지운다.
            likesRepository.deleteLikesByUserAndPosts(click.get().getUser(),post);
            postsRepository.downlikeCount(post.getId());
            return false;
        } else{
            //좋아요 하기
            Likes likes = new Likes(post,user);
            likesRepository.save(likes);
            postsRepository.uplikeCount(post.getId());
            return true;
        }



    }
}
