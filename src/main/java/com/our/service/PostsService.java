//package com.our.service;
//
//
//import com.our.domain.posts.PostRepository;
//import com.our.dto.posts.PostsMainResponseDto;
//import com.our.dto.posts.PostsSaveRequestDto;
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@AllArgsConstructor
//@Service
//public class PostsService {
//    private PostRepository postRepository;
//
//    @Transactional
//    public Long save(PostsSaveRequestDto dto){
//        return postRepository.save(dto.toEntity()).getId();
//    }
//
//    @Transactional
//    public List<PostsMainResponseDto> findAllDesc(){
//        return postRepository.findAllDesc().map(PostsMainResponseDto::new).collect(Collectors.toList());
//    }
//}
