package com.clone.cloneproject.controller;

import com.clone.cloneproject.config.UserDetailsImpl;
import com.clone.cloneproject.domain.Posts;
import com.clone.cloneproject.dto.PostsRequestDto;
import com.clone.cloneproject.service.PostsService;
import com.clone.cloneproject.service.S3Service;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostsController {

    private final PostsService postsService;
    private final S3Service s3Service;

    // 모든 게시글 불러오기
    @GetMapping("/api/posts")
    public List<Posts> getContents() {return postsService.showMain();}

    // 게시물 생성
    @PostMapping("/api/posts/write")
    public Posts postContents(@RequestPart PostsRequestDto requestDto,
                              @AuthenticationPrincipal UserDetailsImpl userDetails, @RequestPart MultipartFile file){

        String username = userDetails.getUsername();
        String imgPath = s3Service.upload(file);
        //이미지 경로를 받아온다.
        requestDto.setImgUrl(imgPath);
        //Dto에 담아준뒤 , 서비스 로직에 넘긴다.
        return postsService.postConents(requestDto,username);

    }
    // myPage 게시물 조회
    @GetMapping("/api/posts/{postId}")
    public Posts showMyContents(@PathVariable Long postId){
        return postsService.showMyContents(postId);
    }

    // 게시글 수정
    @PutMapping("/api/posts/modify/{postId}")
    public Long updateContents(@PathVariable Long postId,
                               @RequestPart PostsRequestDto requestDto, @RequestPart MultipartFile file){

        String imgPath = s3Service.upload(file);
        requestDto.setImgUrl(imgPath);
        postsService.update(postId, requestDto);

        return postId;
    }

    // 게시글 삭제
    @DeleteMapping("/api/posts/delete/{postId}")
    public Long deleteContent(@PathVariable Long postId){
        return postsService.deleteContent(postId);
    }


//
}
