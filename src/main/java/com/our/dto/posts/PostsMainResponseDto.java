//package com.our.dto.posts;
//
//
//import com.our.domain.posts.Posts;
//import lombok.Getter;
//
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.Optional;
//
//@Getter
//public class PostsMainResponseDto {
//    private Long id;
//    private String title;
//    private String author;
//    private String createdDate;
//
//    public PostsMainResponseDto(Posts entity){
//        id = entity.getId();
//        title = entity.getTitle();
//        author = entity.getAuthor();
//        createdDate = toStringDateTime(entity.getCreatedDate());
//    }
//
//    private String toStringDateTime(LocalDateTime localDateTime){
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        return Optional.ofNullable(localDateTime)
//                .map(formatter::format)
//                .orElse("");
//    }
//}
