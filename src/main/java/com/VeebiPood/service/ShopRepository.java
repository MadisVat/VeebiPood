package com.VeebiPood.service;

import com.VeebiPood.service.Dropdowns.Category;
import com.VeebiPood.service.Dropdowns.CategoryRowMapper;
import com.VeebiPood.service.gettersAndSetters.Product;
import com.VeebiPood.service.gettersAndSetters.ProductRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ShopRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public void insertProduct(Product product) {
        String sql = "INSERT INTO product (serial, name_short, name_long, category_id, colour, size, gender, brand, quantity, price) " +
                "VALUES (:serial, :name_short, :name_long, :category_id, :colour, :size, :gender, :brand, :quantity, :price)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("serial", product.getSerial());
        paramMap.put("name_short", product.getName_short());
        paramMap.put("name_long", product.getName_long());
        paramMap.put("category_id", product.getCategory_id());
        paramMap.put("colour", product.getColour());
        paramMap.put("size", product.getSize());
        paramMap.put("gender", product.getGender());
        paramMap.put("brand", product.getBrand());
        paramMap.put("quantity", product.getQuantity());
        paramMap.put("price", product.getPrice());
        jdbcTemplate.update(sql, paramMap);
    }

    public List<Product> getProductInfo() {
        String sql = "SELECT * FROM product";
        return jdbcTemplate.query(sql, new HashMap<>(), new ProductRowMapper());
    }

    public void addCategory(Category category) {
        String sql = "INSERT INTO category (name) VALUES (:name)";
        Map<String, Object> paraMap = new HashMap<>();
        paraMap.put("name", category.getName());
        jdbcTemplate.update(sql, paraMap);
    }

    public List<Category> getCategory() {
        String sql = "SELECT id, name FROM category";
        return jdbcTemplate.query(sql, new HashMap<>(), new CategoryRowMapper());
    }




/*

    public void createAccount(AddAccount addAccount) {
        String sql = "INSERT INTO bank (account_no, balance, client_id) VALUES (:account_no, :balance, :client_id)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("account_no", addAccount.getAccountNumber());
        paramMap.put("balance", addAccount.getBalance());
        paramMap.put("client_id", addAccount.getClientId());
        jdbcTemplate.update(sql, paramMap);



    public BigDecimal getBalance(String fromAccount) {
        String sql = "SELECT balance FROM bank WHERE account_no = :account_no";
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("account_no", fromAccount);
        return jdbcTemplate.queryForObject(sql, paramMap, BigDecimal.class);
    }

    public void updateBalance(String fromAccount, BigDecimal amount) {
        String sql = "UPDATE bank SET balance = :balance WHERE account_no = :account_no";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("account_no", fromAccount);
        paramMap.put("balance", amount);
        jdbcTemplate.update(sql, paramMap);
    }


    public Long createClient(AddClient addClient) {
        String sql = "INSERT INTO clients (first_name, last_name) VALUES (:first_name, :last_name)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("first_name", addClient.getFirstName());
        paramMap.put("last_name", addClient.getLastName());
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(sql, new MapSqlParameterSource(paramMap), keyHolder);
        return (Long) keyHolder.getKeys().get("id");
    }

    public Long getAccountIdByAccountNumber(String account) {
        String sql = "SELECT id FROM bank WHERE account_no = :account_no";
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("account_no", account);
        return jdbcTemplate.queryForObject(sql, paramMap, Long.class);
    }

    public void logDeposit(Long toAccountId, BigDecimal amount) {
        String sql = "INSERT INTO transaction_history (to_account, sum) VALUES (:to_account, :sum)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("to_account", toAccountId);
        paramMap.put("sum", amount);
        jdbcTemplate.update(sql, paramMap);
    }

    public void logWithdraw(Long fromAccountId, BigDecimal amount) {
        String sql = "INSERT INTO transaction_history (from_account, sum) VALUES (:from_account, :sum)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("from_account", fromAccountId);
        paramMap.put("sum", amount);
        jdbcTemplate.update(sql, paramMap);
    }

    public void logTransfer(Long fromAccountId, Long toAccountId, BigDecimal amount) {
        String sql = "INSERT INTO transaction_history (from_account, to_account, sum) VALUES (:from_account, :to_account, :sum)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("from_account", fromAccountId);
        paramMap.put("to_account", toAccountId);
        paramMap.put("sum", amount);
        jdbcTemplate.update(sql, paramMap);
    }
*/

    // TODO delete account? client?
    // TODO print out account list(tabeli formaadis - NP kasuta loopi) - see jäi tegemata. Tõenäoliselt võiks ära teha sist poes ka vaja
}
