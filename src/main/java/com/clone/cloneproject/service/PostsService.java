package com.clone.cloneproject.service;

import com.clone.cloneproject.domain.Comments;
import com.clone.cloneproject.domain.Posts;
import com.clone.cloneproject.domain.User;
import com.clone.cloneproject.dto.PostsRequestDto;
import com.clone.cloneproject.repository.CommentsRepository;
import com.clone.cloneproject.repository.PostsRepository;
import com.clone.cloneproject.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;
    private final UserRepository userRepository;
    private final CommentsRepository commentsRepository;

    // 게시글 조회(게시글 리스트)
    public List<Posts> showMain() {
        return postsRepository.findAllByOrderByModifiedAtDesc();
    };

    // 게시글 생성
    @Transactional
    public Posts postConents(PostsRequestDto requestDto, String username) {
        User user = userRepository.findByUsername(username).orElseThrow(()
                -> new IllegalArgumentException("가입되지 않은 username 입니다."));
        Posts posts = new Posts(requestDto, user);
        return postsRepository.save(posts);
    }
    // 나의 게시물만 조회
    public Posts showMyContents(Long postId) {

        //해당 게시물의 존재 여부 확인 // 1번 게시글조회
        Posts posts = postsRepository.findById(postId)
                .orElseThrow(()-> new IllegalArgumentException("게시물이 존재하지 않습니다."));
        //게시물에 해당하는 댓글들을 전부 모아온다.
        List<Comments> commentsList =
                commentsRepository.findCommentsByPostsIdOrderByModifiedAt(postId);

        //1번 게시글들에 작성된 댓글들을 List에 담아준다.
        for(Comments c  :commentsList){
            posts.getCommentsList().add(c);
        }

        return posts;
    }
    // 게시물 수정
    @Transactional
    public void update(Long postId, PostsRequestDto requestDto){
        Posts posts = postsRepository.findById(postId).orElseThrow(
                () -> new IllegalArgumentException("해당하는 게시물이 없습니다.")
        );
        posts.update(requestDto);
    }
    // 게시글 삭제
    public Long deleteContent(Long postId){
        postsRepository.deleteById(postId);
        return postId;
    }



}
//