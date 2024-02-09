package com.mjc.school.service.dto;

import com.mjc.school.repository.model.AuthorModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


public record NewsDtoResponse (Long id, String title, String content, LocalDateTime createDate,  LocalDateTime lastUpdateDate, Long authorId, List<TagDtoResponse> tagList, List<CommentDtoResponse> commentList){


}