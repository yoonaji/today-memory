//JPA 인터페이스를 상속받아서 DB 접근 로직을 자동으로 생성
package com.springboot.today_memory.repository;

import com.springboot.today_memory.dto.DiaryResponseDto;
import com.springboot.today_memory.entity.Diary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiaryRepository extends JpaRepository<Diary, Integer> {

    List<DiaryResponseDto> findAllByOrderByUpdatedAtDesc();
}
