package com.sparta.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // 스프링이 처음 기동될 때 이 부분을 읽음
public class BeanConfiguration {

    @Bean   // 리턴되는 값을 Bean 등록
    public ProductRepository productRepository() {
        String dbUrl = "jdbc:h2:mem:springcoredb";
        String dbId = "sa";
        String dbPassword = "";

        // 새로운 객체에 전달 받은 값을 리턴
        return new ProductRepository(dbUrl, dbId, dbPassword);
    }
}