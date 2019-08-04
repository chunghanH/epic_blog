package com.example.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entity.Article;
import com.example.service.BlogService;


@Controller
public class BlogController {
    
    @Resource
    private BlogService blogService; 
    
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("text", "hello");
        return "index";
    }    
    
    @GetMapping("/api/articles")
    public @ResponseBody List<Article> articles(){
        return blogService.articles();
    }
    
    @GetMapping("/api/articles/{id}")
    public @ResponseBody Article article(@PathVariable("id") long id){
        return blogService.article(id);
    }
    
    @PostMapping("/api/articles")
    public @ResponseBody void create(@RequestBody Article article){
        blogService.create(article);
    }
    
    @PutMapping("/api/articles/{id}")
    public @ResponseBody void update(@RequestBody Article article){
        blogService.update(article);
    }
    
    @DeleteMapping("/api/articles/{id}")
    public @ResponseBody void delete(@PathVariable("id") long id){
        blogService.delete(id);
    }
    
}
