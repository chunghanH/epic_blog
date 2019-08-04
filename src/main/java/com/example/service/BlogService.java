package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.repository.ArticleRepository;

import com.example.entity.Article;


@Service
public class BlogService {
    
    @Autowired
    private ArticleRepository articleRepository;
    
    public List<Article> articles() {
        return articleRepository.findAll();
    }
    
    public Article article(long id) {
        Optional<Article> tmp = articleRepository.findById(id);
        return tmp.get();
    }
    
    @Transactional
    public void create(Article article) {
        articleRepository.save(article);
    }
    
    @Transactional
    public void update(Article article) {
        articleRepository.save(article);
    }
    
    @Transactional
    public void delete(long id) {
        articleRepository.deleteById(id); 
    }
}
