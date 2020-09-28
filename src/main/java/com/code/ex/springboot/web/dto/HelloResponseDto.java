package com.code.ex.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
//gradlew wrapper --gradle-version 4.10.2
@Getter
@RequiredArgsConstructor
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
