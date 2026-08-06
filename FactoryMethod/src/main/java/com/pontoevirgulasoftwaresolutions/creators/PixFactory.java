package com.pontoevirgulasoftwaresolutions.creators;

import com.pontoevirgulasoftwaresolutions.products.PaymentProcessor;
import com.pontoevirgulasoftwaresolutions.products.PixProcessor;

public class PixFactory extends PaymentFactory{
    @Override
    public PaymentProcessor createProcessor() {
        return new PixProcessor();
    }
}
