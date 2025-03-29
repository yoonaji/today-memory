package com.springboot.today_memory.dto;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class DiaryRequestDto {

    private String title;
    private String content;
}
