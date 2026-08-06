package com.pontoevirgulasoftwaresolutions.products;

import com.pontoevirgulasoftwaresolutions.models.Payment;
import com.pontoevirgulasoftwaresolutions.models.PaymentResult;

import java.util.UUID;

public class PixProcessor implements PaymentProcessor{

    @Override
    public PaymentResult process(Payment payment) {
        return new PaymentResult(
                true,
        UUID.randomUUID().toString(),
                "Pix payment approved.",
                "PIX"
        );
    }

    private void generatePixKey(){
        System.out.println("Generating PIX QR Code...");
    }

    private void waitForConfirmation(){
        System.out.println("Waiting for customer confirmation");
    }
}
