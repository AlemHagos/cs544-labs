package edu.miu.demo.version1.service;

import edu.miu.demo.version1.domain.dto.PostDto;

import java.util.List;

public interface PostService {
    public List<PostDto> findAll();
    public PostDto findById(long id);
    public void save(PostDto p);
    public void delete(long id);
    public void update(long id,  PostDto p);

}
