package org.zerock.tack.dto;


import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
public class PageResponseDTO<E> {

    // 변수.
    // 목록 뽑아주는 List.
    private List<E> list;
    // PageRequestDTO의 getCountEnd의 Total.
    private long total;

    // Builder 달아주기.
    @Builder(builderMethodName = "withAll")
    public PageResponseDTO(List<E> list , long total) {
        this.list = list;
        this.total = total;
    }

    
}
