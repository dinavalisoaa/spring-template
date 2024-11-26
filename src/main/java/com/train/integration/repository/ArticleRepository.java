package com.train.integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.train.integration.model.Article;
import java.util.List;
import java.util.Optional;
import java.util.Date;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ArticleRepository extends JpaRepository<Article, Long> {
    Optional<Article> findById(Long id);
    
    @Query(nativeQuery = true, 
       value = "SELECT * FROM article WHERE author_id  IN (?1)")
    List<Article> findArticlesByAuthor(List<Integer> ids);
}