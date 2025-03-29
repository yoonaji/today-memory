package com.springboot.today_memory.dto;

import com.springboot.today_memory.entity.Diary;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class DiaryResponseDto {
    private String title;

    private String content;

    private LocalDateTime createdAt;

    public DiaryResponseDto(Diary diary) {
        this.title = diary.getTitle();
        this.content = diary.getContent();
        this.createdAt = diary.getCreatedAt();
    }
}

