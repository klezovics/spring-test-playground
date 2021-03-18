package com.klezovich.springtestplayground.contextconfiguration;

import com.klezovich.springtestplayground.user.UserRepository;
import com.klezovich.springtestplayground.user.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

@ExtendWith(SpringExtension.class)
public class TestConfigurationTest {

    private static final UserRepository repo = mock(UserRepository.class);

    @Autowired
    private UserService service;

    @Test
    void testConfigurationIsAsExpected() {
        assertTrue(Objects.nonNull(service));
    }

    @TestConfiguration
    static class TestConfig {

        @Bean
        public UserService userService() {
            return new UserService(repo);
        }
    }
}
