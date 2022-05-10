package com.supmti.prodcutsspringrest.dao.mapper;

import com.supmti.prodcutsspringrest.entities.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product product = new Product();

        product.setId(rs.getInt("id_produit"));
        product.setDesignation(rs.getString("designation"));
        product.setPrice(rs.getDouble("price"));


        return product;
    }
}