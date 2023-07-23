package org.zerock.tack.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.tack.dto.BoardDTO;
import org.zerock.tack.mappers.BoardMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Service
@Log4j2
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    // 맵퍼 final.
    private final BoardMapper boardMapper;

    // 게시판 리스트.
    @Override
    public List<BoardDTO> getList() {
        // 리턴.
        return boardMapper.getList();
    }

    // 게시글 불러오기.
    @Override
    public BoardDTO boardOne(int bno) {
        // 리턴.
        return boardMapper.getOne(bno);
    }

    // 게시글 등록하기.
    @Override
    public int boardInsert(BoardDTO boardDTO) {
        // 리턴.
        return boardMapper.boardInsert(boardDTO);
    }

    // 게시글 삭제하기.
    @Override
    public int boardDelete(int bno) {
        // 리턴.
        return boardMapper.boardDelete(bno);
    }

    // 게시글 수정하기.
    @Override
    public int boardModify(BoardDTO boardDTO) {
        // 리턴.
        return boardMapper.boardModify(boardDTO);
    }

    
    
}
