package com.example.demo;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public class CustomItemProcessor implements ItemProcessor<Transaction, Transaction> {

    @Override
    @Nullable
    public Transaction process(@NonNull Transaction item) throws Exception {
        return item; 
    }
    
    
}
