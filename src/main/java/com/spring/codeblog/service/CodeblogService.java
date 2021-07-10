package com.spring.codeblog.service;

import com.spring.codeblog.model.Post;
import javassist.tools.rmi.ObjectNotFoundException;

import java.util.List;

public interface CodeblogService {
    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
    long deleteById(long id) throws ObjectNotFoundException;
}
