package com.indivaragroup.jdt17.spring.dasar.config.resource.file;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Component
@RequiredArgsConstructor
public class ResourceSample {

    private ApplicationContext applicationContext;

    @PostConstruct
    public void readSampleResource() throws IOException {
        Resource resource = new ClassPathResource("/media.file/JDT-17-EDI-JAVA-TEST.txt");

        String content = resource.getContentAsString(StandardCharsets.UTF_8);
        System.out.println(content);
    }

}
