package com.VeebiPood.service.gettersAndSetters;

import com.VeebiPood.service.Dropdowns.Category;
import org.springframework.jdbc.core.RowMapper;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();
        product.setId(resultSet.getLong("id"));
        product.setSerial(resultSet.getString("serial"));
        product.setName_short(resultSet.getString("name_short"));
        product.setName_long(resultSet.getString("name_long"));
        product.setCategory_id(resultSet.getLong("category_id"));
        product.setColour(resultSet.getString("colour"));
        product.setSize(resultSet.getString("size"));
        product.setGender(resultSet.getString("gender"));
        product.setBrand(resultSet.getString("brand"));
        product.setQuantity(resultSet.getLong("quantity"));
        product.setPrice(resultSet.getBigDecimal("price"));
        return product;
    }
}

// TODO Kus ma seda kasutada tahtsingi???


