package com.neo.springboard.service;

import com.neo.springboard.domain.type.SearchType;
import com.neo.springboard.dto.ArticleDto;
<<<<<<< Updated upstream
import com.neo.springboard.dto.ArticleUpdateDto;
import com.neo.springboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
=======
import com.neo.springboard.dto.ArticleWithCommentsDto;
import com.neo.springboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
>>>>>>> Stashed changes
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Transactional(readOnly = true)
<<<<<<< Updated upstream
    public Page<ArticleDto> searchArticles(SearchType title, String search_keyword) {
=======
    public Page<ArticleDto> searchArticles(SearchType searchType, String searchKeyword, Pageable pageable) {
>>>>>>> Stashed changes
        return Page.empty();
    }

    @Transactional(readOnly = true)
<<<<<<< Updated upstream
    public ArticleDto searchArticle(long l) {
=======
    public ArticleWithCommentsDto getArticle(Long articleId) {
>>>>>>> Stashed changes
        return null;
    }

    public void saveArticle(ArticleDto dto) {
    }

<<<<<<< Updated upstream
    public void updateArticle(long articleId, ArticleUpdateDto dto) {
=======
    public void updateArticle(ArticleDto dto) {
>>>>>>> Stashed changes
    }

    public void deleteArticle(long articleId) {
    }

<<<<<<< Updated upstream
    
=======

>>>>>>> Stashed changes
}
