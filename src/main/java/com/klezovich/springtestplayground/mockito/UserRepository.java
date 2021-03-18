package com.klezovich.springtestplayground.mockito;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserRepository {

    public User save(User u) {
        return u;
    }
}
