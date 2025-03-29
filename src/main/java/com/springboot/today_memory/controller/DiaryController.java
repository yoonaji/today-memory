//rest api 요청 받는 곳. 클라이언트 -> 서버로 들어오는 요청 받음
package com.springboot.today_memory.controller;

import com.springboot.today_memory.dto.DiaryRequestDto;
import com.springboot.today_memory.dto.DiaryResponseDto;
import com.springboot.today_memory.service.DiaryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DiaryController {
    private DiaryService diaryService;

    public DiaryController(DiaryService diaryService) {
        this.diaryService = diaryService;
    }

    @PostMapping("/diarys")
    public DiaryResponseDto createDiary(@RequestBody DiaryRequestDto requestDto) {
        DiaryResponseDto diaryResponseDto = diaryService.createDiary(requestDto);
        return diaryResponseDto;
    }

    //전체 게시글 조회
    @GetMapping("/diarys")
    public List<DiaryResponseDto> getAllDiary() {
        return diaryService.findAllDiary();
    }

    //수정해주는 함수인데 id를 알아야되게 설정함
    @PutMapping("/diarys/{id}")
    public DiaryResponseDto updateDiary(@PathVariable Integer id, @RequestBody DiaryRequestDto requestDto) {
        return diaryService.updateDiary(id, requestDto);
    }

    @DeleteMapping("/diarys/{id}")
    public void deleteDiary(@PathVariable Integer id) {
        diaryService.deleteDiary(id);
    }
}
