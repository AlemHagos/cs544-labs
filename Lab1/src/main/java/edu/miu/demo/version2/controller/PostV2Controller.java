package edu.miu.demo.version2.controller;
import edu.miu.demo.version2.domain.dto.PostV2Dto;
import edu.miu.demo.version2.service.PostV2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/posts")
public class PostV2Controller {
    @Autowired
    PostV2Service postService;
    @GetMapping
    public List<PostV2Dto> getAll(){
        return postService.findAll();
    }
    @GetMapping("/{id}")
    public PostV2Dto getById(@PathVariable("id") long id){
        return postService.findById(id);
    }
    @PostMapping
    public void create(@RequestBody PostV2Dto postDto){
        postService.save(postDto);
    }
    @PutMapping("/{id}")
    public void change( @PathVariable("id") long id,@RequestBody PostV2Dto postDto){
        postService.update(id,postDto);
    }
    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") long id){
        postService.delete(id);
    }
    @GetMapping("/{author}")
    public List<PostV2Dto> filterPostsByAuthor(@PathVariable("author") String author) {
        return postService.findAllPostsByAuthor(author);
    }

}
