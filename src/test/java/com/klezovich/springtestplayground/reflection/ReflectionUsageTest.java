package com.klezovich.springtestplayground.reflection;

import org.junit.jupiter.api.Test;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReflectionUsageTest {

    @Test
    void testCanSetPrivateFieldViaRefelction() {
        var user = new User();
        ReflectionTestUtils.setField(user, "id", "user_id_1", String.class);
        assertEquals("user_id_1", user.getId());
    }
}
