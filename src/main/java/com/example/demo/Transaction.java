package com.example.demo;

import java.time.LocalDateTime;

import jakarta.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("restrictions")
@XmlRootElement(name = "transactionRecord")
public class Transaction {
    private String username;
    private int userId;
    private LocalDateTime transactionDate;
    private double amount;

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }
    
    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Transaction() {

    }

    public Transaction(String username, int userId, LocalDateTime transactionDate, double amount) {
        this.username = username;
        this.userId = userId;
        this.transactionDate = transactionDate;
        this.amount = amount;
    }

     @Override
    public String toString() {
        return "Transaction [username=" + username + ", userId=" + userId
                + ", transactionDate=" + transactionDate + ", amount=" + amount
                + "]";
    }

}
