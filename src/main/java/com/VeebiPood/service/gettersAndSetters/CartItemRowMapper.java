package com.VeebiPood.service.gettersAndSetters;

import com.VeebiPood.service.Dropdowns.Category;
import org.springframework.jdbc.core.RowMapper;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CartItemRowMapper implements RowMapper<CartItem> {

    @Override
    public CartItem mapRow(ResultSet resultSet, int i) throws SQLException {
        CartItem cartItem = new CartItem();
        cartItem.setId(resultSet.getLong("id"));
        cartItem.setProductId(resultSet.getLong("product_id"));
        cartItem.setAccountId(resultSet.getLong("account_id"));
        cartItem.setQuantity(resultSet.getLong("quantity"));
        cartItem.setPrice(resultSet.getBigDecimal("price"));
        return cartItem;
    }
}
