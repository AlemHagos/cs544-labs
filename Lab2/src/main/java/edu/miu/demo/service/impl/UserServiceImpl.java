package edu.miu.demo.service.impl;

import edu.miu.demo.domain.Post;
import edu.miu.demo.domain.User;
import edu.miu.demo.repository.UserRepository;
import edu.miu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
        @Autowired
        private UserRepository userRepository;
         @Override
        public List<User> findAll() {
             return  userRepository.findAll();
        }
        @Override
        public User findById(long id) {
          return  userRepository.findById(id).get();
        }

        @Override
        public void save(User user) {
            userRepository.save(user);
        }

    @Override
    public List<Post> findPosts(long id) {
           User  user = userRepository.findById(id).get();
        return user.getPosts();

    }

}
