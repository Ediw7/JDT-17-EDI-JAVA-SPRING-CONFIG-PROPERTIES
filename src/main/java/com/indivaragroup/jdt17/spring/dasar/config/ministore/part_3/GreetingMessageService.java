package com.indivaragroup.jdt17.spring.dasar.config.ministore.part_3;

import com.indivaragroup.jdt17.spring.dasar.config.ministore.part_1.StoreProperties;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class GreetingMessageService {

    private final MessageSource messageSource;
    private final StoreProperties storeProperties;

    public GreetingMessageService(
            MessageSource messageSource,
            StoreProperties storeProperties
    ) {
        this.messageSource = messageSource;
        this.storeProperties = storeProperties;
    }

    public String getGreeting(Locale locale) {
        Object[] args = new Object[]{storeProperties.getName(), storeProperties.getCity()};
        return messageSource.getMessage("store.greeting", args, locale);
    }

    public String getStatus(Locale locale) {
        String messageKey = storeProperties.getActive() ? "store.status.active" : "store.status.inactive";
        return messageSource.getMessage(messageKey, null, locale);
    }
}