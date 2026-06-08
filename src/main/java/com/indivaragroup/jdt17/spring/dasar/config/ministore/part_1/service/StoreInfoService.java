package com.indivaragroup.jdt17.spring.dasar.config.ministore.part_1.service;

import com.indivaragroup.jdt17.spring.dasar.config.ministore.part_1.StoreProperties;
import org.springframework.stereotype.Service;

@Service
public class StoreInfoService {
    private final StoreProperties storeProperties;

    public StoreInfoService(StoreProperties storeProperties) {
        this.storeProperties = storeProperties;
    }

    public void printStoreInfo() {
        System.out.println("Store Name      : " + storeProperties.getName());
        System.out.println("Store City      : " + storeProperties.getCity());
        System.out.println("Currency        : " + storeProperties.getCurrency());
        System.out.println("Max Daily Order : " + storeProperties.getMaxDailyOrder());
        System.out.println("Active          : " + storeProperties.getActive());
    }
}
