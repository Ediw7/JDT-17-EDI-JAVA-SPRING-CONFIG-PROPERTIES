package com.indivaragroup.jdt17.spring.dasar.config.ministore.part_4;

import com.indivaragroup.jdt17.spring.dasar.config.ministore.part_1.service.StoreInfoService;
import com.indivaragroup.jdt17.spring.dasar.config.ministore.part_2.ResourceReaderService;
import com.indivaragroup.jdt17.spring.dasar.config.ministore.part_3.GreetingMessageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Locale;

@Component
public class AppRunner implements CommandLineRunner {

    private final StoreInfoService storeInfoService;
    private final ResourceReaderService resourceReaderService;
    private final GreetingMessageService greetingMessageService;

    public AppRunner(
            StoreInfoService storeInfoService,
            ResourceReaderService resourceReaderService,
            GreetingMessageService greetingMessageService
    ) {
        this.storeInfoService = storeInfoService;
        this.resourceReaderService = resourceReaderService;
        this.greetingMessageService = greetingMessageService;
    }

    @Override
    public void run(String... args) throws IOException {

        System.out.println(resourceReaderService.readBanner());


        storeInfoService.printStoreInfo();
        System.out.println();
        System.out.println("[EN] " + greetingMessageService.getGreeting(Locale.ENGLISH));
        System.out.println(greetingMessageService.getStatus(Locale.ENGLISH));

        System.out.println();
        Locale localeId = new Locale("id", "ID");
        System.out.println("[ID] " + greetingMessageService.getGreeting(localeId));
        System.out.println(greetingMessageService.getStatus(localeId));
    }
}