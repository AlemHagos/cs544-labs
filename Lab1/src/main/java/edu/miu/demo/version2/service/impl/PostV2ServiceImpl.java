package edu.miu.demo.version2.service.impl;
import edu.miu.demo.version1.repository.PostRepo;
import edu.miu.demo.version2.domain.PostV2;
import edu.miu.demo.version2.domain.dto.PostV2Dto;
import edu.miu.demo.version2.repository.PostV2Repo;
import edu.miu.demo.version2.service.PostV2Service;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class PostV2ServiceImpl implements PostV2Service {
         @Autowired
        private PostV2Repo postRepo;

        @Autowired
        ModelMapper modelMapper;

        public List<PostV2Dto> findAll() {
            var posts = postRepo.findAll();
            return
                    posts.stream()
                            .map(p -> modelMapper.map(p,PostV2Dto.class))
                            .collect(Collectors.toList());
        }


        public PostV2Dto findById(long id) {
            return modelMapper.map(postRepo.findById(id), PostV2Dto.class);
        }


        @Override
        public void save(PostV2Dto p) {

            postRepo.save(modelMapper.map(p, (Type) PostV2.class));
        }

        @Override
        public void delete(long id) {
            postRepo.delete(id);
        }

        @Override
        public void update(long id,  PostV2Dto p) {
            postRepo.update(id, modelMapper.map(p, (Type) PostV2.class));
        }

    @Override
    public List<PostV2Dto> findAllPostsByAuthor(String author) {
        var posts = postRepo.findAllPostsByAuthor(author);
        return
                posts.stream()
                        .map(p -> modelMapper.map(p,PostV2Dto.class))
                        .collect(Collectors.toList());
    }


}
