package com.indivaragroup.jdt17.spring.dasar.config.resource.file;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
public class ResourceSampeLoaderTest {

    @Autowired
    public ResourceSampleLouder resourceSampleLouder;

    @Test
    void testResourceLoader () throws IOException{
        resourceSampleLouder.sampleResource();
    }
}
