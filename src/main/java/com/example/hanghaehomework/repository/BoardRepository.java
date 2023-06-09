package com.example.hanghaehomework.repository;

import com.example.hanghaehomework.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {

    List<Board> findAllByOrderByModifiedAtDesc();   //작성날짜 기준으로 변경


}