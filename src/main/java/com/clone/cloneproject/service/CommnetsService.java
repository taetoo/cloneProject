package com.clone.cloneproject.service;


import com.clone.cloneproject.config.UserDetailsImpl;
import com.clone.cloneproject.domain.Comments;
import com.clone.cloneproject.domain.Posts;
import com.clone.cloneproject.dto.CommentsRequestDto;
import com.clone.cloneproject.repository.CommentsRepository;
import com.clone.cloneproject.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;



@Service
public class CommnetsService {
    private final CommentsRepository commentsRepository;
    private final PostsRepository postsRepository;

    @Autowired
    public CommnetsService(CommentsRepository commentsRepository, PostsRepository postsRepository) {
        this.commentsRepository = commentsRepository;
        this.postsRepository = postsRepository;
    }



    //등록
    @Transactional
    public Comments postComment(Long id, CommentsRequestDto commentsRequestDto, @AuthenticationPrincipal UserDetailsImpl userDetails) {

        //User정보 찾기

        //해당 게시물 찾기
        Posts post = postsRepository.findById(id).orElseThrow(
                ()-> new IllegalArgumentException("댓글이 존재하지않습니다.")
        );

        // 아이디 찾기
        String username = userDetails.getUser().getUsername();

        Comments comments = Comments.builder()
                .id(commentsRequestDto.getId())
                .contents(commentsRequestDto.getContents())
                .posts(post)
                .username(username)
                .build();

        return commentsRepository.save(comments);
    }


    //삭제
    public void deleteComments(Long Id){
        commentsRepository.deleteById(Id);

    }
    //수정
    @Transactional
    public Long updateComment(Long id,CommentsRequestDto commentsRequestDto){

        Comments comment = commentsRepository.findById(id).orElseThrow(
                ()-> new IllegalArgumentException("댓글이 존재하지않습니다.")
        );
        comment.update(commentsRequestDto);
        return comment.getId();

    }



}
