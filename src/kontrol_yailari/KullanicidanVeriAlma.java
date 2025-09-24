package kontrol_yailari;
import java.util.Scanner;

public class KullanicidanVeriAlma {
    public static void main(String[] args) {
    Scanner tara = new Scanner(System.in);
    int kullanicinin_girdiyi_sayi = tara.nextInt();
    System.out.println("Kullanicinin girdiyi deger : " + kullanicinin_girdiyi_sayi);
    String isim = tara.next();
    System.out.println("girilen isim : "+ isim);
    tara.nextLine();
    String isim_soyisim = tara.nextLine();
    System.out.println("girilen isim ve soyisim : "+ isim_soyisim);
    char harf = tara.next().charAt(1);
    System.out.println("girilen harf : " + harf);
    }

}
