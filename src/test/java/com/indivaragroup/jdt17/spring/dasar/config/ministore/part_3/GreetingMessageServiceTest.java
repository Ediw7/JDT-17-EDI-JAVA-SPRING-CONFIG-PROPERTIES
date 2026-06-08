package com.indivaragroup.jdt17.spring.dasar.config.ministore.part_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Locale;

@SpringBootTest
public class GreetingMessageServiceTest {
    @Autowired
    private GreetingMessageService greetingMessageService;

    @Test
    void testGreetingEnglish() {

        String greeting = greetingMessageService.getGreeting(Locale.ENGLISH);
        String status = greetingMessageService.getStatus(Locale.ENGLISH);
        Assertions.assertEquals("Welcome to Indivara Mini Store located in Jakarta", greeting);
        Assertions.assertEquals("Store is currently active", status);
    }

    @Test
    void testGreetingIndonesia() {
        Locale localeId = new Locale("id", "ID");
        String greeting = greetingMessageService.getGreeting(localeId);
        String status = greetingMessageService.getStatus(localeId);

        Assertions.assertEquals("Selamat datang di Indivara Mini Store yang berlokasi di Jakarta", greeting);
        Assertions.assertEquals("Toko sedang aktif", status);
    }
}