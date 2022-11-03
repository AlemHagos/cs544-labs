package edu.miu.demo.version1.repository;

import edu.miu.demo.version1.domain.Post;

import java.util.List;

public interface PostRepo {

    public List<Post> findAll();
    public Post findById(long id);
    public void save(Post p);
    public void delete(long id);
    public void update(long id, Post p);
}
