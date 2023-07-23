package org.zerock.tack.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.tack.dto.BoardDTO;
import org.zerock.tack.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Controller
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/board/")
public class BoardController {

    private final BoardService boardService;

    // 게시판 리스트.
    // Model 사용.
    @GetMapping("list")
    public void list(Model model) {

        List<BoardDTO> list = boardService.getList();

        // log출력으로 확인.
        log.info("GET | List!!!!!!!!!!");

        // model 전달.
        model.addAttribute("list", list);
    }

    // 게시판 보기.
    // GET.
    @GetMapping("read/{bno}")
    public String getRead(@PathVariable("bno") int bno, Model model) {

        BoardDTO boardOne = boardService.boardOne(bno);

        log.info("GET | Read!!!!!!!!!!");
        model.addAttribute("boardOne", boardOne);

        return "/board/read";
    }

    // 게시글 등록.
    // GET.
    @GetMapping("regist/{bno}")
    public String getRegist(@PathVariable("bno") int bno, Model model) {

        log.info("GET | Register!!!!!!!!!!");

        return "board/register";
    }

    // POST.
    @PostMapping("/regist/{bno}")
    public  String postRegist(BoardDTO boardDTO) {

        log.info("POST | regist!!!!!!!!!!");
        boardService.boardInsert(boardDTO);

        return "redirect:/board/list";
    }


    // 게시글 수정.
    // GET.
    @GetMapping("modify/{bno}")
    public String getModify(@PathVariable("bno") int bno, Model model) {

        log.info("GET | Modify!!!!!!!!!!");

        return "board/modify";
    }

    // POST.
    @PostMapping("/modify")
    public  String postModify(BoardDTO boardDTO) {

        log.info("POST | ,modify!!!!!!!!!!");
        boardService.boardModify(boardDTO);

        return  "redirect:/board/read";
    }

    // 게시글 삭제.
    // POST.
    @PostMapping("/delete/{bno}")
    public String podtDelete(@PathVariable("bno") int bno) {

        log.info("POST | delete!!!!!!!!!!");
        boardService.boardDelete(bno);

        return "redirect:/board/list";
    }
    
}
