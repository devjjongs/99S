package com.sparta.springcore;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//@RequiredArgsConstructor // final로 선언된 멤버 변수를 자동으로 생성합니다.
@RestController // JSON으로 데이터를 주고받음을 선언합니다.
public class ProductController {

    // 멤버 변수 선언
    private final ProductService productService;

    // 반복 사용되는 Service 생성자
    @Autowired // 생성자가 1개이면 생략 가능 하지만 명시적으로 표시 해주기 위해서 사용
    public ProductController(ProductService productService) {
//        ProductService productService = new ProductService();
//        this.productService = productService;

        // 느슨한 결합을 위한 의존성 주입(DI)
        this.productService = productService;
    }

    // 신규 상품 등록
    @PostMapping("/api/products")
    // @RequestBody에 ProductRequestDto를 받아서 가져옴
    public Product createProduct(@RequestBody ProductRequestDto requestDto) throws SQLException {
        // Service 사용을 위한 선언
//        ProductService productService = new ProductService();

        // Service의 createProduct() 메소드 호출
        Product product = productService.createProduct(requestDto);

        // 응답 보내기
        return product;
    }

    // 설정 가격 변경
    @PutMapping("/api/products/{id}")
    public Long updateProduct(@PathVariable Long id, @RequestBody ProductMypriceRequestDto requestDto) throws SQLException {

        // Service 사용을 위한 선언
//        ProductService productService = new ProductService();

        // Service의 updateProduct() 메소드 호출
        Product product = productService.updateProduct(id, requestDto);

        // 응답 보내기 (업데이트된 상품 id)
        return product.getId();
    }

    // 등록된 전체 상품 목록 조회
    @GetMapping("/api/products")
    public List<Product> getProducts() throws SQLException {

        // Service 사용을 위한 선언
//        ProductService productService = new ProductService();

        // Service의 getProducts() 메소드 호출
        List<Product> products = productService.getProducts();

        // 응답 보내기
        return products;
    }
}