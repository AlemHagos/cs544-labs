package edu.miu.demo.service.impl;

import edu.miu.demo.domain.Post;
import edu.miu.demo.repository.PostRepository;
import edu.miu.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PostServiceImpl implements PostService {
        @Autowired
        private PostRepository postRepository;
         @Override
        public List<Post> findAll() {
             return postRepository.findAll();
        }
        @Override
        public Post findById(long id) {
          return  postRepository.findById(id).get();
        }

        @Override
        public void save(Post post) {

            postRepository.save(post);
        }

        @Override
        public void delete(long id) {
            postRepository.deleteById(id);
        }

        @Override
        public void update(long id, Post post) {
              Post pos =  postRepository.findById(id).get();
              pos.setAuthor(post.getAuthor());
              pos.setTitle(post.getTitle());
              pos.setContent(post.getContent());
              postRepository.save(pos);
        }

}
