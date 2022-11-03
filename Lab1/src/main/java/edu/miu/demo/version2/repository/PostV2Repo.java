package edu.miu.demo.version2.repository;

import edu.miu.demo.version2.domain.PostV2;

import java.util.List;

public interface PostV2Repo {

    public List<PostV2> findAll();
    public PostV2 findById(long id);
    public void save(PostV2 p);
    public void delete(long id);
    public void update(long id, PostV2 p);
    public List<PostV2>findAllPostsByAuthor(String author);
}
