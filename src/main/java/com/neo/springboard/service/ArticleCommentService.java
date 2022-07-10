package com.neo.springboard.service;

import com.neo.springboard.dto.ArticleCommentDto;
import com.neo.springboard.repository.ArticleCommentRepository;
import com.neo.springboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleCommentService {

    private final ArticleRepository articleRepository;
    private final ArticleCommentRepository articleCommentRepository;

    @Transactional(readOnly = true)
<<<<<<< Updated upstream
    public List<ArticleCommentDto> searchArticleComment(Long articleId) {
=======
    public List<ArticleCommentDto> searchArticleComments(Long articleId) {
>>>>>>> Stashed changes
        return List.of();
    }

    public void saveArticleComment(ArticleCommentDto dto) {
    }

<<<<<<< Updated upstream
=======
    public void updateArticleComment(ArticleCommentDto dto) {
    }

    public void deleteArticleComment(Long articleCommentId) {
    }
>>>>>>> Stashed changes
}
