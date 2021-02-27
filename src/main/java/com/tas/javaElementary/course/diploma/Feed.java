package com.tas.javaElementary.course.diploma;

import java.util.ArrayList;
import java.util.List;

public class Feed {

    private List<Post> posts = new ArrayList<>();

    public List<Post> getPosts() {
        return posts;
    }

    public boolean addPost(Post post) {
        return posts.add(post);
    }
}
