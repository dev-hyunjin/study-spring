package com.example.ex00.dependency;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest @Slf4j
public class DependencyTests {
    @Autowired
    Coding coding;

    @Test
    public void testCoding(){
        log.info(String.valueOf(coding));
    }
}
