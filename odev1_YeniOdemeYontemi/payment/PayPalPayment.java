package com.n11.payment;

public class PayPalPayment implements IPaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println(amount + " TL PayPal ile ödendi. Cüzdan kontrol edildi.");
    }
}
