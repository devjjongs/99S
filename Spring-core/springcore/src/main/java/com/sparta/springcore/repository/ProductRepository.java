package com.sparta.springcore.repository;

import com.sparta.springcore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// ProductRepository 파일 리팩토링
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByUserId(Long userId);
}

/*
public class ProductRepository {

    // 멤버 변수 선언
    private final String dbUrl;
    private final String dbId;
    private final String dbPassword;

    // 의존성 주입을 위한 생성자 선언
    public ProductRepository(String dbUrl, String dbId, String dbPassword) {
        this.dbUrl = dbUrl;
        this.dbId = dbId;
        this.dbPassword = dbPassword;
    }

    // 중복되는 DB 연결 코드
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, dbId, dbPassword);
    }

    public void createProduct(Product product) throws SQLException {
        // DB 연결
        Connection connection = getConnection();

        // DB Query 작성
        PreparedStatement ps = connection.prepareStatement("select max(id) as id from product");
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            // product id 설정 = product 테이블의 마지막 id + 1
            product.setId(rs.getLong("id") + 1);
        } else {
            throw new SQLException("product 테이블의 마지막 id 값을 찾아오지 못했습니다.");
        }
        ps = connection.prepareStatement("insert into product(id, title, image, link, lprice, myprice) values(?, ?, ?, ?, ?, ?)");
        ps.setLong(1, product.getId());
        ps.setString(2, product.getTitle());
        ps.setString(3, product.getImage());
        ps.setString(4, product.getLink());
        ps.setInt(5, product.getLprice());
        ps.setInt(6, product.getMyprice());

        // DB Query 실행
        ps.executeUpdate();

        // DB 연결 해제
        ps.close();
        connection.close();
    }

    public Product getProduct(Long id) throws SQLException {
        // 받은 데이터를 저장할 Product 객체 생성
        Product product = new Product();

        // DB 연결
        Connection connection = getConnection();

        // DB Query 작성
        PreparedStatement ps = connection.prepareStatement("select * from product where id = ?");
        ps.setLong(1, id);

        // DB Query 실행
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            product.setId(rs.getLong("id"));
            product.setImage(rs.getString("image"));
            product.setLink(rs.getString("link"));
            product.setLprice(rs.getInt("lprice"));
            product.setMyprice(rs.getInt("myprice"));
            product.setTitle(rs.getString("title"));

        }

        // DB 연결 해제
        ps.close();
        connection.close();

        // 가져온 정보 리턴
        return product;
    }

    public void updateMyprice(Long id, int myprice) throws SQLException {
        // DB 연결
        Connection connection = getConnection();

        // DB Query 작성
        PreparedStatement ps = connection.prepareStatement("select * from product where id = ?");
        ps.setLong(1, id);

        // DB Query 작성
        ps = connection.prepareStatement("update product set myprice = ? where id = ?");

        // 클라이언트에서 넘어온 myprice, id 전달
        ps.setInt(1, myprice);
        ps.setLong(2, id);

        // DB Query 실행
        ps.executeUpdate();

        // DB 연결 해제
        ps.close();
        connection.close();
    }

    public List<Product> getProducts() throws SQLException {
        List<Product> products = new ArrayList<>();

        // DB 연결
        Connection connection = getConnection();

        // DB Query 작성 및 실행
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("select * from product");

        // DB Query 결과를 상품 객체 리스트로 변환
        while (rs.next()) {
            Product product = new Product();
            product.setId(rs.getLong("id"));
            product.setImage(rs.getString("image"));
            product.setLink(rs.getString("link"));
            product.setLprice(rs.getInt("lprice"));
            product.setMyprice(rs.getInt("myprice"));
            product.setTitle(rs.getString("title"));
            products.add(product);
        }

        // DB 연결 해제
        rs.close();
        connection.close();

        // DB에서 전달받은 정보 리턴
        return products;
    }
}
*/
