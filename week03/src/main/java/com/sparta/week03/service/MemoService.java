package com.sparta.week03.service;

import com.sparta.week03.domain.Memo;
import com.sparta.week03.domain.MemoRepository;
import com.sparta.week03.domain.MemoRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor // final 선언한 것을 포함시키기 위해서 필요
@Service
public class MemoService {

    private final MemoRepository memoRepository;

    public Long update(Long id, MemoRequestDto requestDto) {
        Memo memo = memoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("아이디가 존재하지 않습니다."));
        memo.update(requestDto);
        return memo.getId();
    }
}
