package com.sparta.week01.controller;

import com.sparta.week01.prac.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/myinfo")
    public Person getPerson() {
        Person person = new Person();
        person.setName("홍길동");
        person.setAge(20);
        person.setAddress("서울특별시 영등포구");
        person.setPetName("하늘");
        person.setPetAge(7);
        return person;
    }
}