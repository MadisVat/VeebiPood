package com.VeebiPood.service;


import com.VeebiPood.service.Dropdowns.Category;
import com.VeebiPood.service.gettersAndSetters.AddCartItemRequest;
import com.VeebiPood.service.gettersAndSetters.LoggedInResponse;
import com.VeebiPood.service.gettersAndSetters.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.security.Principal;
import java.util.List;

@RestController
public class ShopController {
    @Autowired
    private ShopService shopService;

    @PutMapping("insertProduct")
    public void insertProduct(@RequestBody Product product) {
        shopService.insertProduct(product);
    }

    // TODO kategooria kuvamine korrektseks

    @GetMapping("getProductInfo")
    public List<Product> getProductInfo() {
        return shopService.getProductInfo();
    }

    @PutMapping("addCategory")
    public void addCategory(@RequestBody Category category) {
        shopService.addCategory(category);
    }

    @GetMapping("getCategory")
    public List<Category> getCategory() {
        return shopService.getCategory();
    }

    @GetMapping("userStatus")
    public LoggedInResponse userStatus(Principal principal) {
        return new LoggedInResponse(principal);
    }
  
    @GetMapping("getProductPrice")
    public BigDecimal getProductPrice(@RequestBody Long id) {
        return shopService.getProductPrice(id);
    }

    @PutMapping("addItemToCart")
    public void addItemToCart(@RequestBody AddCartItemRequest request, Principal principal) {
        shopService.addItemToCart(request.getProductId(), request.getQuantity(), principal.getName());
    }

//    @PutMapping("withdraw/{accountNumber}")
//    public BigDecimal withdraw(@PathVariable("accountNumber") String request, @RequestBody BigDecimal amount) {
//        accountService.withdrawCurrency(request, amount);
//        return accountService.getBalance(request);
//    }


//    @GetMapping("getProductPic")


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