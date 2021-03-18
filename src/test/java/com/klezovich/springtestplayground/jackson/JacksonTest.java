package com.klezovich.springtestplayground.jackson;

import com.klezovich.springtestplayground.user.User;
import com.klezovich.springtestplayground.user.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@WebMvcTest
@AutoConfigureJsonTesters
public class JacksonTest {

    @Autowired
    private JacksonTester<User> userJson;

    @MockBean
    private UserService service;

    @Test
    void testCanDeserializeJson() throws IOException {
        var user = userJson.parseObject("{\"id\":1, \"name\": \"AK\"}");
        assertEquals(1,user.getId());
        assertEquals("AK",user.getName());
    }
}
