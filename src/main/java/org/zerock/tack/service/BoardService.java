package org.zerock.tack.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.zerock.tack.dto.BoardDTO;


@Transactional
public interface BoardService {

    List<BoardDTO> getList();

    // 게시글 가져오기.
    BoardDTO boardOne(int bno);

    // 게시글 등록.
    int boardInsert(BoardDTO boardDTO);

    // 게시글 삭제.
    int boardDelete(int bno);

    // 게시글 수정.
    int boardModify(BoardDTO boardDTO);
}
