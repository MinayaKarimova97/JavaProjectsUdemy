package operatorlar;

public class ConditionsOperators {
    public static void main(String[] args) {
        int sayi1 = 10, sayi2 = 20;
        System.out.println("sayi1 esitdir sayi2 : "+(sayi1==sayi2));
        System.out.println("sayi1 esitdir sayi2 : "+(sayi1!=sayi2));

        boolean deger1 = true;
        boolean deger2 = false;
        System.out.println("deger1 ve deger2 and durumu "+(deger1 && deger2));
        System.out.println("deger1 ve deger2 and durumu "+(deger1 || deger2));


    }
}
