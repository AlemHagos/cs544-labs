package edu.miu.demo.version2.repository.impl;
import edu.miu.demo.version2.domain.PostV2;
import edu.miu.demo.version2.repository.PostV2Repo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PostV2RepoImpl implements PostV2Repo {
    private static long postId = 5l;
        private static List<PostV2> posts = new ArrayList<>( Arrays.asList(
                new PostV2(1l,"Car","I love it","James"),
             new PostV2(2l,"Phone","It is ordinary","Charles"),
             new PostV2(3l,"Laptop","Not that good","Jackson"),
             new PostV2(4l,"Book","It does the job","Martha")));


        @Override
        public List<PostV2> findAll(){
            return posts;
        }

    @Override
    public PostV2 findById(long id) {
        return posts
                .stream()
                .filter(l -> l.getId() == id)
                .findFirst()
                .orElse(null);

    }

        public void save(PostV2 p) {
            p.setId(postId);
            postId++;
            posts.add(p);
        }


        @Override
        public void delete(long id) {
            var post =posts
                    .stream()
                    .filter(l -> l.getId() == id)
                    .findFirst().get();
            posts.remove(post);
        }

        @Override
        public void update(long id, PostV2 p) {
            PostV2 toUpdate = findById(id);
            toUpdate.setTitle(p.getTitle());
            toUpdate.setAuthor(p.getAuthor());

        }
    @Override
    public List<PostV2>findAllPostsByAuthor(String author){
        return posts.stream()
                .filter(p -> p.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    }


