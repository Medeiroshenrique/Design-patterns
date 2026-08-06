package com.pontoevirgulasoftwaresolutions.models;


import java.math.BigDecimal;
import java.util.UUID;

public class Payment {
    private UUID id;
    private String payerName;
    private String payerEmail;
    private BigDecimal amount;
    private String description;
    private String currency;

    public Payment(UUID id, String payerName, String payerEmail, BigDecimal amount,
                   String description, String currency) {
        this.id = id;
        this.payerName = payerName;
        this.payerEmail = payerEmail;
        this.amount = amount;
        this.description = description;
        this.currency = currency;
    }


}
