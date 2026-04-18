package com.n11.payment;

public class CreditCardPayment implements IPaymentMethod{
    @Override
    public void processPayment(double amount) {
        System.out.println(amount + " TL Kredi Kartı ile ödendi. Banka onayı alındı.");
    }
}
