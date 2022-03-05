package com.our.web;


import com.our.service.PostsService;
import com.our.service.RecordService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class webController {

    private PostsService postsService;
    private RecordService recordService;

    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("record", recordService.findAllDesc());
        return "index";
    }
}
