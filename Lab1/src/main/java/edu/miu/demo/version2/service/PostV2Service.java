package edu.miu.demo.version2.service;


import edu.miu.demo.version2.domain.dto.PostV2Dto;

import java.util.List;

public interface PostV2Service {
    public List<PostV2Dto> findAll();
    public PostV2Dto findById(long id);
    public void save(PostV2Dto p);
    public void delete(long id);
    public void update(long id,  PostV2Dto p);
    public List<PostV2Dto>findAllPostsByAuthor(String author);


}
