package com.indivaragroup.jdt17.spring.dasar.config.ministore.part_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
public class ResourceReaderServiceTest {

    @Autowired
    private ResourceReaderService resourceReaderService;

    @Test
    void testResourceLoaderReadsBanner() throws IOException {
        String banner = resourceReaderService.readBanner();
        Assertions.assertNotNull(banner, "Banner tidak boleh null");
    }
}