//@Entity 클래스들
package com.springboot.today_memory.entity;

import com.springboot.today_memory.dto.DiaryRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id; // 이게 맞아!
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@Entity(name = "diary")
@EntityListeners(AuditingEntityListener.class)  // 중요!
public class Diary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="diary_id", unique = true, nullable = false)
    private int id;

    private String title;
    private String content;

    @CreatedDate
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Diary(DiaryRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
    }

    public void updateDiary(DiaryRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
    }

}
