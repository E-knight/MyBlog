package com.example.blog.web;

import com.example.blog.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){

        return "index";
    }

    @GetMapping("/index")
    public String index2(){
        return "index";
    }

    @GetMapping("/blog")
    public String blog(){
        return "blog";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/archives")
    public String archives(){
        return "archives";
    }

    @GetMapping("/tags")
    public String tags(){
        return "tags";
    }

    @GetMapping("/types")
    public String types(){
        return "types";
    }

    @GetMapping("/blogs")
    public String blogs(){
        return "/admin/blogs";
    }

    @GetMapping("/input")
    public String input(){
        return "/admin/input";
    }
}
