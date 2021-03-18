package com.klezovich.springtestplayground.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @InjectMocks
    private UserService service;

    @Mock
    private UserRepository repository;

    @Test
    void testCanRegisterNewGuest() {
        var user = new User("user1");
        mockUserSavedByRepository(user);

        service.createNewUser("user1");
        verifyUserSaved(user);
    }

    private void mockUserSavedByRepository(User user) {
        when(repository.save(user)).thenReturn(user);
    }

    private void verifyUserSaved(User user) {
        verify(repository).save(user);
    }
}