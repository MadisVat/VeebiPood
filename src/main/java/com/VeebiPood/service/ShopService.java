package com.VeebiPood.service;


import com.VeebiPood.service.Dropdowns.Category;
import com.VeebiPood.service.Hybernate.HybernateRepo;
import com.VeebiPood.service.gettersAndSetters.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {
    @Autowired
    private ShopRepository shopRepository;

    @Autowired
    private HybernateRepo hybernateRepo;

    public void insertProduct(Product product) {
//Hybernate puhul tuleks selle asemele hybernateRepo.save(account); vms
        shopRepository.insertProduct(product);
    }

    public List<Category> getCategory() {
        return shopRepository.getCategory();
    }

    public List<Product> getProductInfo() {
        return shopRepository.getProductInfo();
    }




    /*public BigDecimal getBalance(String fromAccount) {
        return shopRepository.getBalance(fromAccount);
    }

    public BigDecimal depositCurrency(String toAccount, BigDecimal amount) {
        shopRepository.getBalance(toAccount);
        BigDecimal currentBalance = shopRepository.getBalance(toAccount);
        System.out.println("Current balance: " + currentBalance);
        int result = amount.compareTo(BigDecimal.ZERO);
        if (result > 0) {
            BigDecimal newBalance = currentBalance.add(amount);
            System.out.println("New Balance: " + newBalance);
            shopRepository.updateBalance(toAccount, newBalance);
            Long accountId = shopRepository.getAccountIdByAccountNumber(toAccount);
            shopRepository.logDeposit(accountId, amount);
            return shopRepository.getBalance(toAccount);
        } else {
            System.out.println("Can not deposit a negative sum");
            return shopRepository.getBalance(toAccount);
        }
    }

    public BigDecimal withdrawCurrency(String fromAccount, BigDecimal amount) {
        shopRepository.getBalance(fromAccount);
        BigDecimal currentBalance = shopRepository.getBalance(fromAccount);
        System.out.println("Current balance: " + currentBalance);
        int result = amount.compareTo(BigDecimal.ZERO);
        if (result > 0) {
            BigDecimal newBalance = currentBalance.subtract(amount);
            System.out.println("New Balance: " + newBalance);
            shopRepository.updateBalance(fromAccount, newBalance);
            Long accountId = shopRepository.getAccountIdByAccountNumber(fromAccount);
            shopRepository.logWithdraw(accountId, amount);
            return shopRepository.getBalance(fromAccount);
        } else {
            System.out.println("Can't withdraw a negative sum");
            return shopRepository.getBalance(fromAccount);
        }
    }

    public BigDecimal transferCurrency(String fromAccount, String toAccount, BigDecimal amount) {
        shopRepository.getBalance(fromAccount);
        BigDecimal currentBalanceFrom = shopRepository.getBalance(fromAccount);
        System.out.println("Current balance \"From Account\": " + currentBalanceFrom);
        int kasNullistSuurem = amount.compareTo(BigDecimal.ZERO);
        if (kasNullistSuurem > 0) {
            int result = currentBalanceFrom.compareTo(amount);
            if (result >= 0) {
                BigDecimal newBalanceFrom = currentBalanceFrom.subtract(amount);
                System.out.println("New balance \"From Account\": " + newBalanceFrom);
                shopRepository.updateBalance(fromAccount, newBalanceFrom);
                shopRepository.getBalance(toAccount); // to Account
                BigDecimal currentBalanceTo = shopRepository.getBalance(toAccount);
                System.out.println("Current balance \"TO Account\": " + currentBalanceTo);
                BigDecimal newBalanceTo = currentBalanceTo.add(amount);
                System.out.println("New balance \"TO Account\": " + newBalanceTo);
                shopRepository.updateBalance(toAccount, newBalanceTo);
                Long fromAccountId = shopRepository.getAccountIdByAccountNumber(fromAccount);
                Long toAccountId = shopRepository.getAccountIdByAccountNumber(toAccount);
                shopRepository.logTransfer(fromAccountId, toAccountId, amount);
                return shopRepository.getBalance(toAccount);
            } else {
                System.out.println("Insufficient funds");
                return shopRepository.getBalance(toAccount);
            }
        }
        System.out.println("Amount can't be smaller than 0");
        return shopRepository.getBalance(toAccount);
    }

    public void createAccount(AddAccount addAccount) {
        if (addAccount.getBalance() == null) {
            addAccount.setBalance(BigDecimal.ZERO);
        }
        shopRepository.createAccount(addAccount);

    }

    public Long createClient(AddClient addClient) {
        return shopRepository.createClient(addClient);
    }*/
}