package com.example.fraudapi;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraudCheckController {

    @GetMapping("/check")
    @ResponseStatus(HttpStatus.OK)
    public FraudCheckResponse check() {
        FraudCheckResponse fraudCheckResponse = new FraudCheckResponse();
        fraudCheckResponse.setFraud(true);
        fraudCheckResponse.setMessage("Stolen Card");
        return fraudCheckResponse;
    }
}
