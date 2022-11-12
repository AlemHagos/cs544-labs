package edu.miu.demo.controller;

import edu.miu.demo.domain.Comment;
import edu.miu.demo.domain.Post;
import edu.miu.demo.domain.User;
import edu.miu.demo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/admin")
    public ResponseEntity<List<Post>> getAll(){
        var posts = postService.findAll();
        return ResponseEntity.ok().body(posts);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> getById(@PathVariable Long id){
        var post = postService.findById(id);
        return ResponseEntity.ok(post);
    }

    @PostMapping
    public ResponseEntity<Post> create(@RequestBody Post post){
        postService.save(post);
        return ResponseEntity.ok(post);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Post> update(@RequestBody Post post, @PathVariable Long id){
        post.setId(id);
        postService.save(post);
        return ResponseEntity.ok(post);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        postService.delete(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }


    @GetMapping("/{id}/comments")
    public void addComment(@PathVariable("id") long id, @RequestBody Comment comment){
        postService.addComment(id, comment);
    }
    @GetMapping("/{title}")
    public List<Post> findPostByTitle(@PathVariable String title) {
        return postService.findPostByTitle(title);
    }

}
