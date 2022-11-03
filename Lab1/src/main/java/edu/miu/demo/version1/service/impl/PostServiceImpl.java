package edu.miu.demo.version1.service.impl;

import edu.miu.demo.version1.domain.Post;
import edu.miu.demo.version1.domain.dto.PostDto;
import edu.miu.demo.version1.repository.PostRepo;
import edu.miu.demo.version1.service.PostService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
        @Autowired
        private  PostRepo postRepo;

        @Autowired
        ModelMapper modelMapper;

        public List<PostDto> findAll() {
            var posts = postRepo.findAll();
            return
                    posts.stream()
                            .map(p -> modelMapper.map(p,PostDto.class))
                            .collect(Collectors.toList());
        }

        public PostDto findById(long id) {
            return modelMapper.map(postRepo.findById(id), PostDto.class);
        }


        @Override
        public void save(PostDto p) {

            postRepo.save(modelMapper.map(p, Post.class));
        }

        @Override
        public void delete(long id) {
            postRepo.delete(id);
        }

        @Override
        public void update(long id,  PostDto p) {
            postRepo.update(id, modelMapper.map(p, Post.class));
        }

}
