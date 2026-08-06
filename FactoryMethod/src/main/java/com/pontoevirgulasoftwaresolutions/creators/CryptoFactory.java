package com.pontoevirgulasoftwaresolutions.creators;

import com.pontoevirgulasoftwaresolutions.products.CryptoProcessor;
import com.pontoevirgulasoftwaresolutions.products.PaymentProcessor;

public class CryptoFactory extends PaymentFactory{
    @Override
    public PaymentProcessor createProcessor() {
        return new CryptoProcessor();
    }
}
