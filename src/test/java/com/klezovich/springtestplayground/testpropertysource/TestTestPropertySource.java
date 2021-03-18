package com.klezovich.springtestplayground.testpropertysource;

import com.klezovich.springtestplayground.SecretMessage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@TestPropertySource(properties = {"secret.message = ABC"})
public class TestTestPropertySource {

    @Autowired
    private SecretMessage message;

    @Test
    void testMessageLoadedCorrectly() {
        assertEquals("ABC",message.getMessage());
    }
}
