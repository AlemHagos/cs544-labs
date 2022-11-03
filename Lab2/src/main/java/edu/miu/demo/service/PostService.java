package edu.miu.demo.service;

import edu.miu.demo.domain.Post;

import java.util.List;

public interface PostService {
    public List<Post> findAll();
    public Post findById(long id);
    public void save(Post post);
    public void delete(long id);
    public void update(long id,Post post);

}
