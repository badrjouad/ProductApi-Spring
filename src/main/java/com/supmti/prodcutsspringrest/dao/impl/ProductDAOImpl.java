package com.supmti.prodcutsspringrest.dao.impl;

import com.supmti.prodcutsspringrest.dao.api.ProductDAO;
import com.supmti.prodcutsspringrest.dao.mapper.ProductMapper;
import com.supmti.prodcutsspringrest.entities.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.List;


@Configuration
@ComponentScan
public class ProductDAOImpl implements ProductDAO {
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;
    @Bean
    public DataSource mysqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_products_management");
        dataSource.setUsername("root");
        dataSource.setPassword("");

        return dataSource;
    }

    @Override
    public void createProduct(Product product) {

    }

    @Override
    public List<Product> getProducts() {
        List<Product> productList = null;
        String query = "SELECT * FROM PRODUCT ";
        Product product = (Product) jdbcTemplate.query(
                query, new ProductMapper());
      return productList;


    }

    @Override
    public void deleteProductById(Long id) {

    }
}
