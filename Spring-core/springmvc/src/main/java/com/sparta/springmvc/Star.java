package com.sparta.springmvc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter // @ModelAttribute를 사용하기 위해서 꼭 필요
public class Star {
    String name;
    int age;
}