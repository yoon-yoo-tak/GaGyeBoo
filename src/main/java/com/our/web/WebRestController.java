package com.our.web;

import com.our.domain.posts.PostRepository;
import com.our.domain.posts.Posts;
import com.our.dto.posts.PostsSaveRequestDto;
import com.our.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsService postsService;
    private PostRepository postRepository;


    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto){
        return postsService.save(dto);
    }
}
