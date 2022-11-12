package edu.miu.demo.service.impl;

import edu.miu.demo.domain.Comment;
import edu.miu.demo.repository.CommentRepository;
import edu.miu.demo.service.CommentService;
import edu.miu.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

        private final CommentRepository commentRepository;
         @Override
        public List<Comment> findAll() {
             return  commentRepository.findAll();
        }
        @Override
        public Comment findById(long id) {
          return  commentRepository.findById(id).get();
        }

        @Override
        public void save(Comment com) {
            commentRepository.save(com);
        }




}
