package com.sparta.week01.prac;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class PersonRequestDto {
    private String name;
    private int age;
    private String address;
    private String petName;
    private int petAge;
}
