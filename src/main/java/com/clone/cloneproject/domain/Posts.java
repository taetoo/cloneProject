package com.clone.cloneproject.domain;


import com.clone.cloneproject.dto.PostsRequestDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;
//
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@Entity
public class Posts extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "posts_id")
    private Long id;

    @Column(nullable = false)
    private String contents;

    @Column(columnDefinition = "TEXT")
    private String imgUrl;

    @Column
    private int likeCount;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @JsonIgnoreProperties({"posts"})
    @OneToMany(mappedBy = "posts", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    private List<Comments> commentsList;

    @JsonIgnoreProperties({"posts"})
    @OneToMany(mappedBy = "posts")
    private List<Likes> likesList;



    // 게시물 새성 생성자
    public Posts(PostsRequestDto requestDto, User user) {
        this.imgUrl = requestDto.getImgUrl();
        this.contents = requestDto.getContents();
        // User 정보 모두 가져다 쓰기
        this.user = user;
    }

    // 게시물 수정 생성자
    public void update(PostsRequestDto requestDto) {
        this.imgUrl = requestDto.getImgUrl();
        this.contents = requestDto.getContents();
    }
}