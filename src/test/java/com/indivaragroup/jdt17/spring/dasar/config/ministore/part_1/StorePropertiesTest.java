package com.indivaragroup.jdt17.spring.dasar.config.ministore.part_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StorePropertiesTest {

    @Autowired
    private StoreProperties storeProperties;

    @Test
    void testPropertiesLoadedCorrectly() {
        Assertions.assertEquals("Indivara Mini Store", storeProperties.getName());
        Assertions.assertEquals("Jakarta", storeProperties.getCity());
        Assertions.assertEquals("IDR", storeProperties.getCurrency());
        Assertions.assertEquals(100, storeProperties.getMaxDailyOrder());
        Assertions.assertTrue(storeProperties.getActive());
    }
}