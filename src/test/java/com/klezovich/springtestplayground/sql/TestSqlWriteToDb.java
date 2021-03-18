package com.klezovich.springtestplayground.sql;

import com.klezovich.springtestplayground.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.jdbc.Sql;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class TestSqlWriteToDb {

    @Autowired
    private UserRepository repository;

    @Sql("/insert-test-users.sql")
    @Test
    @DirtiesContext
    void testCanLoadUsersAfterRunningSqlScript() {
        assertEquals(2,repository.findAll().spliterator().estimateSize());
    }
}
