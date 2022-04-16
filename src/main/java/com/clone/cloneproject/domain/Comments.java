package com.clone.cloneproject.domain;


import com.clone.cloneproject.dto.CommentsRequestDto;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@Entity
public class Comments extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comments_id")
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String contents;

    @ManyToOne
    @JoinColumn(name = "posts_id")
    private Posts posts;

    @ManyToOne
    @JoinColumn(name= "user_id")
    private User user;


    public void update(CommentsRequestDto commentsRequestDto) {
        this.contents = commentsRequestDto.getContents();
    }



}
