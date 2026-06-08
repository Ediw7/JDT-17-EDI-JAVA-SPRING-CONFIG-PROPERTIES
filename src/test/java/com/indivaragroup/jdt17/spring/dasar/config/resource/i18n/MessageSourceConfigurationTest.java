package com.indivaragroup.jdt17.spring.dasar.config.resource.i18n;


import jakarta.websocket.OnClose;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;
import org.springframework.web.servlet.LocaleResolver;

import java.util.Locale;

@SpringBootTest
public class MessageSourceConfigurationTest {
    @Autowired
    private MessageSource messageSource;
    @Autowired
    private LocaleResolver localeResolver;

    @Test
    void testHelloEnglish(){
        String message = messageSource.getMessage(
                "error.field.messages.name", new Object[]{"buahlil"}, Locale.ENGLISH
        ); Assertions.assertEquals("this name [buahlil] already taken", message);

    }
    @Test
    void testHelloIndonesia(){
        String message = messageSource.getMessage("error.field.messages.name", new Object[]{"buahlil"}, new Locale("id", "ID")
        ); Assertions.assertEquals("nama ini [buahlil] sudah digunakan", message);
    }
}
