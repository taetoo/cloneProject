package com.clone.cloneproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;


@Getter
@Service
@NoArgsConstructor
@AllArgsConstructor
public class CommentsRequestDto {
    private Long id;
    private String contents;
    private Long postId;


}
