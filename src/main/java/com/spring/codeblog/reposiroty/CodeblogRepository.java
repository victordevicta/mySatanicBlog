package com.spring.codeblog.reposiroty;

import com.spring.codeblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeblogRepository extends JpaRepository<Post, Long>{

}
