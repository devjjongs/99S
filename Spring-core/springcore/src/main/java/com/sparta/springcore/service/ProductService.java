package com.sparta.springcore.service;

import com.sparta.springcore.model.Product;
import com.sparta.springcore.dto.ProductMypriceRequestDto;
import com.sparta.springcore.repository.ProductRepository;
import com.sparta.springcore.dto.ProductRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//@Service
public class ProductService {

    // 멤버 변수 선언
    private final ProductRepository productRepository;

    // 반복 사용 되는 Service 생성자
    @Autowired
    public ProductService(ProductRepository productRepository) {
//        ProductRepository productRepository = new ProductRepository();
//        this.productRepository = productRepository;

        // 느슨한 결합을 위한 의존성 주입(DI)
        this.productRepository = productRepository;
    }

    // 관심 상품 등록 메소드
    public Product createProduct(ProductRequestDto requestDto) {
        // 요청 받은 DTO 로 DB에 저장할 객체 만들기
        Product product = new Product(requestDto);

        // Repository를 사용 하기 위해 선언
//        ProductRepository productRepository = new ProductRepository();

        // Repository의 createProduct() 메소드 호출
//        productRepository.createProduct(product);

        // JPA 문법으로 리팩토링
        productRepository.save(product);

        // Product를 리턴
        return product;
    }

    public Product updateProduct(Long id, ProductMypriceRequestDto requestDto) {
        // Repository를 사용 하기 위해 선언
//        ProductRepository productRepository = new ProductRepository();

        // id 값으로 저장된 상품 가져 오기
//        Product product = productRepository.getProduct(id);

        // JPA 문법으로 리팩토링
        Product product = productRepository.findById(id).orElseThrow(() -> new NullPointerException("해당 아이디가 존재하지 않습니다."));


        // JPA 문법으로 리팩토링
        /*// 에러 캐치
        if (product == null) {
            // 해당 id가 존재 하지 않을 경우
            throw new NullPointerException("해당 아이디가 존재하지 않습니다.");
        }

        // 클라이언트에서 전달받은 requestDto.getMyprice()를 id로 전달
        productRepository.updateMyprice(id, requestDto.getMyprice());*/

        // JPA 문법으로 리팩토링
        int myprice = requestDto.getMyprice();
        product.setMyprice(myprice);
        productRepository.save(product);

        // 업데이트된 product 정보 리턴
        return product;
    }

    public List<Product> getProducts() {
        // Repository를 사용하기 위해 선언
//        ProductRepository productRepository = new ProductRepository();

        // JPA 문법으로 리팩토링
        /*// id 값으로 저장된 상품 가져오기
        List<Product> products = productRepository.getProducts();*/
        List<Product> products = productRepository.findAll();

        // 전달받은 상품목록 리턴
        return products;
    }
}
