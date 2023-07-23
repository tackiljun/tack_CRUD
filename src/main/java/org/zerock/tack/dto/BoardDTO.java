package org.zerock.tack.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {

    // 게시글 번호.
    private int bno;
    // 게시글 제목.
    private String title;
    // 게시글 내용.
    private String content;
    // 작성자.
    private String writer;
    // 등록일.
    private String duedate;
    // 수정일.
    private String updatedate;
}
