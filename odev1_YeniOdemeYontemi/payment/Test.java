package com.n11.payment;

public class Test {
    public static void main(String[] args) {
        java.util.List<IPaymentMethod> odemeler = new java.util.ArrayList<>();

        odemeler.add(new CreditCardPayment());
        odemeler.add(new PayPalPayment());

        System.out.println("--- Ödeme Akışı Başlıyor ---");

        for (IPaymentMethod yontem : odemeler) {
            yontem.processPayment(100.0);
        }
    }
}
