package com.example.fraudapi;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = FraudApiApplication.class)
public class BaseClass {

    @Autowired
    FraudCheckController fraudCheckController;

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(fraudCheckController);
    }
}
