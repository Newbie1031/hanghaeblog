package com.sparta.hanghaeblog.repository;

import com.sparta.hanghaeblog.dto.PostRequestDto;
import com.sparta.hanghaeblog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Long>{
    List<Post> findAllByOrderByModifiedAtDesc();
}
