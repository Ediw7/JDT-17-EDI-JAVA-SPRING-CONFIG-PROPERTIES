package com.indivaragroup.jdt17.spring.dasar.config.resource.file;

import io.micrometer.observation.annotation.ObservationKeyValue;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Component
@RequiredArgsConstructor
public class ResourceSampleLouder implements ResourceLoaderAware {

    private ResourceLoader resourceLoader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader){
        this.resourceLoader = resourceLoader;

    }
    @PostConstruct
    public void sampleResource() throws IOException{
        Resource resource = resourceLoader.getResource("classpath:media.file/JDT-17-EDI-JAVA-TEST.txt");
        String content = resource.getContentAsString(StandardCharsets.UTF_8);
        System.out.println(content);

        System.out.println("ini file dari resource loader");
    }

}

