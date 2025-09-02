package operatorlar;

public class IslemOnceligi {
    public static void main(String[] args) {
        /*
        İşlem önceliği sırası büyükten küçüğe doğru şu şekildedir:
        () önce parantez içi hesaplanır1.
        ++ ve -- (eğer değişkenden önce ise)2.
        çarpma ve bölme3.
        toplama ve çıkarma4.
        = atama işlemi5.
        ++ ve -- (eğer değişkenden sonra ise)
         */
        int sayi1=15;
        int sayi2 = 5;
        int sonuc = 0;
        sonuc = (sayi1 + sayi2*2 - sayi2) + sayi2 - sayi1 *4 + sayi1;
        System.out.println("Sonuc 1: " + sonuc);
        sonuc = (sayi1 * sayi2 + 4 / 2)+ sayi1++ * sayi2 + sayi1;
        System.out.println("Sonuc 2 : " + sonuc);
    }
}
