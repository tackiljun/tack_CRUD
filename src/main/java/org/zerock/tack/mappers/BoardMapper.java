package org.zerock.tack.mappers;

import java.util.List;

import org.zerock.tack.dto.BoardDTO;

public interface BoardMapper {
    
    // 맵퍼들?
    // 게시판 전체목록 가져오기.
    List<BoardDTO> getList();

    // 1개 게시글 가져오기.
    BoardDTO getOne(int bno);

    // 게시글 등록하기.
    int boardInsert(BoardDTO boardDTO);

    // 게시글 삭제하기.
    int boardDelete(int bno);

    // 게시글 수정하기.
    int boardModify(BoardDTO boardDTO);
    
}
