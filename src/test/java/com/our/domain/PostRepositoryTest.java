package com.our.domain;

import com.our.domain.posts.PostRepository;
import com.our.domain.posts.Posts;
import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class PostRepositoryTest {

    @Autowired
    PostRepository postRepository;

    @AfterEach
    public void cleanup(){

        postRepository.deleteAll();
    }

    @Test
    public void save_load(){
        // given
        postRepository.save(Posts.builder()
                .title("테스트 게시글")
                .content("테스트 본문").author("dbsdbxkr").build());

        //when
        List<Posts> postsList = postRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle(),is("테스트 게시글"));
        assertThat(posts.getContent(),is("테스트 본문"));
    }

    @Test
    public void BaseTimeEntity_enroll(){
        //given
        LocalDateTime now = LocalDateTime.now();
        postRepository.save(Posts.builder()
                .title("테스트 게시글")
                .content("테스트 본문")
                .author("dbsdbxrf")
                .build());

        //when
        List<Posts> postsList = postRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        assertTrue(posts.getCreatedDate().isAfter(now));
        assertTrue(posts.getModifiedDate().isAfter(now));
    }
}
