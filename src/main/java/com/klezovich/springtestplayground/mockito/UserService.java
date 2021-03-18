package com.klezovich.springtestplayground.mockito;

public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User createNewUser(String id) {
        return repository.save(new User(id));
    }
}
