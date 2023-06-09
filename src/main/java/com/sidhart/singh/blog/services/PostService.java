package com.sidhart.singh.blog.services;

import com.sidhart.singh.blog.entities.Post;
import com.sidhart.singh.blog.payloads.PostDTO;
import com.sidhart.singh.blog.payloads.PostResponse;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface PostService {
    PostDTO createPost(PostDTO postDTO, Integer userId, Integer categoryId);

    PostDTO updatePost(PostDTO postDTO, Integer postId);

    void deletePost(Integer postId);

    PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);

    PostDTO getPostById(Integer postId);

    List<PostDTO> getPostsByCategory(Integer categoryId);

    List<PostDTO> getPostsByUser(Integer userId);

    List<PostDTO> searchPosts(String keyword);
}
