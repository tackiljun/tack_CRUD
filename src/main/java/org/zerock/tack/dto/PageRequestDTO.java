package org.zerock.tack.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class PageRequestDTO {

    ///////////////////////////////////
    // 변수.
    // 페이지 번호.
    @Builder.Default
    private int page = 1;

    // 페이지 사이즈.
    @Builder.Default
    private int size = 10;
    ///////////////////////////////////

    ///////////////////////////////////
    // 페이지 번호.
    public  void setPage(int page) {

        if(page < 0) {
            this.page = 1;
        } else {
            this.page = page;
        }
    }

    // 페이지 사이즈.
    public void setSize(int size) {
        if(size > 100 ||  size < 0) {
            this.size = 10;
        } else {
            this.size = size;
        }
    }

    ///////////////////////////////////////////////////////////

    // limit skip계산.
    public int getSkip() {
        return (this.page - 1) * this.size;
    }

    // 끝페이지? 구하기.
    public int getEnd() {
        return this.page * this.size;
    }

    // 끝페이지? 카운트구하기.
    public  int getCountEnd() {
        int result = (int) (Math.ceil(this.page / 10.0) * 100);
        return  result + 1;
    }
    ///////////////////////////////////////////////////////////


    
}
