package com.clone.cloneproject.domain;


import lombok.*;

import javax.persistence.*;
//
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Likes {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @ManyToOne
    @JoinColumn(name = "posts_id")
    private Posts posts;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    public Likes(Posts post,User user) {
        this.user = user;
        this.posts = post;
    }


}
