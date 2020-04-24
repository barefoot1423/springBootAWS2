package com.hyunwoocho.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class HelloResponseDto {

    @Getter
    private final String name;
    @Getter
    private final int amount;

}
