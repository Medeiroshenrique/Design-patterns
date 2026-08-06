package com.pontoevirgulasoftwaresolutions.products;

import com.pontoevirgulasoftwaresolutions.models.Payment;
import com.pontoevirgulasoftwaresolutions.models.PaymentResult;

import java.util.UUID;

public class CryptoProcessor implements PaymentProcessor{
    @Override
    public PaymentResult process(Payment payment) {
        return new PaymentResult(
                true,
                UUID.randomUUID().toString(),
                "Blockchain transaction confirmed.",
                "CRYPTO"
        );
    }

    private void generateWalletAddress(){
        System.out.println("Generating wallet...");
    }

    private void waitBlockchainConfirmation(){
        System.out.println("Waiting for blockchain confirmation...");
    }
}
