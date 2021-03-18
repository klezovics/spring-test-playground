package com.klezovich.springtestplayground;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class SecretMessage {

    @Value("${secret.message}")
    private String message;
}
