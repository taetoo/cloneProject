package com.clone.cloneproject.controller;

import com.clone.cloneproject.config.UserDetailsImpl;
import com.clone.cloneproject.dto.LikesDto;
import com.clone.cloneproject.service.LikesService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LikesController {
    private final LikesService likesService;

    public LikesController(LikesService likesService) {
        this.likesService = likesService;
    }

    @PostMapping("/{postId}/like")
    public boolean clickLike (@PathVariable Long postId,@AuthenticationPrincipal UserDetailsImpl userDetail){
        boolean isLike = likesService.likePost(postId,userDetail);
        return  isLike;
    }



}
