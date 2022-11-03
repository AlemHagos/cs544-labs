package edu.miu.demo.version1.repository.impl;

import edu.miu.demo.version1.domain.Post;
import edu.miu.demo.version1.repository.PostRepo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class PostRepoImpl implements PostRepo {
    private static long postId = 5l;
        private static List<Post> posts = new ArrayList<>( Arrays.asList(
                new Post(1l,"Car","I love it","James"),
             new Post(2l,"Phone","It is ordinary","Charles"),
             new Post(3l,"Laptop","Not that good","Jackson"),
             new Post(4l,"Book","It does the job","Martha")));


        @Override
        public List<Post> findAll(){
            return posts;
        }

    @Override
    public Post findById(long id) {
        return posts
                .stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);

    }

        public void save(Post p) {
            p.setId(postId);
            postId++;
            posts.add(p);
        }


        @Override
        public void delete(long id) {
            var post =posts
                    .stream()
                    .filter(p -> p.getId() == id)
                    .findFirst().get();
            posts.remove(post);
        }

        @Override
        public void update(long id, Post p) {
            Post toUpdate = findById(id);
            toUpdate.setTitle(p.getTitle());
            toUpdate.setAuthor(p.getAuthor());
        }

    }


