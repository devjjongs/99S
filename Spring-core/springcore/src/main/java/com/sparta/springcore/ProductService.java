package com.sparta.springcore;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductService {

    // 맴버 변수 선언
    private final ProductRepository productRepository;

    // 반복 사용되는 Service 생성자
    public ProductService() {
        ProductRepository productRepository = new ProductRepository();
        this.productRepository = productRepository;
    }

    // 관심 상품 등록 메소드
    public Product createProduct(ProductRequestDto requestDto) throws SQLException {
        // 요청받은 DTO 로 DB에 저장할 객체 만들기
        Product product = new Product(requestDto);

        // Repository를 사용하기 위해 선언
//        ProductRepository productRepository = new ProductRepository();

        // Repository의 createProduct() 메소드 호출
        productRepository.createProduct(product);

        // Product를 리턴
        return product;
    }

    public Product updateProduct(Long id, ProductMypriceRequestDto requestDto) throws SQLException {
        // Repository를 사용하기 위해 선언
//        ProductRepository productRepository = new ProductRepository();

        // id 값으로 저장된 상품 가져오기
        Product product = productRepository.getProduct(id);

        // 에러 캐치
        if (product == null) {
            // 해당 id가 존재하지 않을 경우
            throw new NullPointerException("해당 아이디가 존재하지 않습니다.");
        }

        // 클라이언트에서 전달받은 requestDto.getMyprice()를 id로 전달
        productRepository.updateMyprice(id, requestDto.getMyprice());

        // 업데이트된 product 정보 리턴
        return product;
    }

    public List<Product> getProducts() throws SQLException {
        // Repository를 사용하기 위해 선언
//        ProductRepository productRepository = new ProductRepository();

        // id 값으로 저장된 상품 가져오기
        List<Product> products = productRepository.getProducts();

        // 전달받은 상품목록 리턴
        return products;
    }
}
