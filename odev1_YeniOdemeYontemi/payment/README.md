# Ödev 1: Yeni Ödeme Yöntemi Entegrasyonu (SOLID)
Bu projede, mevcut ödeme sistemine (kredi kartı ile ödeme) yeni bir ödeme yöntemi (PayPal) eklenmiştir.

## Uygulanan Prensipler
* **Single Responsibility (SRP):** Her ödeme class'ı sadece kendi işleminden sorumludur.
* **Open/Closed (OCP):** Mevcut kodları değiştirmeden `IPaymentMethod` interface'i sayesinde yeni classlar ile yeni yöntemler eklenebilir hale getirilmiştir.

## Nasıl Çalıştırılır?
`Test.java` dosyası çalıştırıldığında konsol üzerinden çıktıları görebilirsiniz.
