package com.springboot.today_memory.service;

import com.springboot.today_memory.dto.DiaryRequestDto;
import com.springboot.today_memory.dto.DiaryResponseDto;
import com.springboot.today_memory.entity.Diary;
import com.springboot.today_memory.repository.DiaryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class DiaryService {

    @Autowired
    private DiaryRepository  diaryRepository;

    public DiaryResponseDto createDiary(DiaryRequestDto requestDto) {
        Diary diary = new Diary(requestDto);
        diaryRepository.save(diary);
        return new DiaryResponseDto(diary);
    }

    public List<DiaryResponseDto> findAllDiary() {
        try {
            List<Diary> diaryList = diaryRepository.findAll();
            List<DiaryResponseDto> diaryResponseDtoList = new ArrayList<>();

            for (Diary diary : diaryList) {
                diaryResponseDtoList.add(new DiaryResponseDto(diary));
            }
            return diaryResponseDtoList;
        } catch (Exception e) {

        }
        return null;

    }

    @Transactional
    public DiaryResponseDto updateDiary(Integer id, DiaryRequestDto requestDto) {
        Diary diary = diaryRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 ID의 다이어리가 없습니다: " + id));
        diary.updateDiary(requestDto);
        return new DiaryResponseDto(diary);
    }

    @Transactional
    public void deleteDiary(Integer id) {
        diaryRepository.deleteById(id);
    }
}
