package degisken_kavrami;

public class TypeCasting {
    public static void main(String[] args) {
        int sayi = 10;
        /*
        double noktaliSayi = 25.25f;
        noktaliSayi = sayi;
        System.out.println("Double-Int : " + noktaliSayi);

        double noktaliSayi= 25.5d;
        sayi = (int) noktaliSayi;
        System.out.println("Int-Double : " + sayi);

        float noktaliSayi = 25.25f;
        noktaliSayi = sayi;
        System.out.println("Double-Int : " + noktaliSayi);

         */
        float noktaliSayi = 25.25f;
        byte byteSayi = 5;
        byteSayi = (byte) noktaliSayi;
        System.out.println("Byte sayi : " + byteSayi);
    }
}
