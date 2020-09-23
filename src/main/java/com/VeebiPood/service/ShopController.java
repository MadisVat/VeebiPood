package com.VeebiPood.service;


import com.VeebiPood.service.Dropdowns.Category;
import com.VeebiPood.service.gettersAndSetters.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShopController {
    @Autowired
    private ShopService shopService;

    @PutMapping("insertProduct")
    public void insertProduct(@RequestBody Product product) {
        shopService.insertProduct(product);
    }

    @GetMapping("getCategory")
    public List<Category> getCategory() {
        return shopService.getCategory();
    }
//POSTMANNIGA SAAB TESTIDA JUUUU
    @GetMapping("getProductInfo")
    public List<Product> getProductInfo() {
        return shopService.getProductInfo();
    }

//    @GetMapping("getProductPic")
//    public List<Category> getCategory() {
//        return shopService.getCategory();
//    }

    /*@GetMapping("balance/{accountNumber}")
    public BigDecimal accountBalance(@PathVariable("accountNumber") String request) {
        return shopService.getBalance(request);
    }

    @PutMapping("deposit/{accountNumber}")
    public BigDecimal deposit(@PathVariable("accountNumber") String request, @RequestBody BigDecimal amount) {
        shopService.depositCurrency(request, amount);
        return shopService.getBalance(request);
    }

    @PutMapping("withdraw/{accountNumber}")
    public BigDecimal withdraw(@PathVariable("accountNumber") String request, @RequestBody BigDecimal amount) {
        shopService.withdrawCurrency(request, amount);
        return shopService.getBalance(request);
    }

    @PutMapping("transfer/{fromAccountNumber},{toAccountNumber}")
    public BigDecimal transfer(@PathVariable String fromAccountNumber, @PathVariable String toAccountNumber, @RequestBody BigDecimal amount) {
        shopService.transferCurrency(fromAccountNumber, toAccountNumber, amount);
        return shopService.getBalance(toAccountNumber);
    }

    @PutMapping("createClient")
    public Long createClient(@RequestBody AddClient addClient) {
        return shopService.createClient(addClient);
    }

    @PutMapping("createAccount")
    public void createAccount(@RequestBody AddAccount addAccount) {
        shopService.createAccount(addAccount);
*/
        // accountService.createAccount(addAccount.getAccountNumber(), addAccount.getBalance(), addAccount.getId());
        /*{
        "accountNumber": "EE333",
            "balance": 0,
            "id": 8888
    }*/

}