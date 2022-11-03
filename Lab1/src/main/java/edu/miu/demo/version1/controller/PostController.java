package edu.miu.demo.version1.controller;

import edu.miu.demo.version1.domain.dto.PostDto;
import edu.miu.demo.version1.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    @Autowired
    PostService postService;
    @GetMapping
    public List<PostDto> getAll(){
        return postService.findAll();
    }
    @GetMapping("/{id}")
    public PostDto getById(@PathVariable("id") long id){
        return postService.findById(id);
    }
    @PostMapping
    public void create(@RequestBody PostDto postDto){
        postService.save(postDto);
    }
    @PutMapping("/{id}")
    public void change( @PathVariable("id") long id,@RequestBody PostDto postDto){
        postService.update(id,postDto);
    }
    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") long id){
        postService.delete(id);
    }

}
