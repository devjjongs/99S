package com.sparta.week03.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    // findAllByOrderByModifiedAtDesc() -> 모든 데이터를 불러올때 최신 순서로 가져오기
    List<Memo> findAllByOrderByModifiedAtDesc();
}
