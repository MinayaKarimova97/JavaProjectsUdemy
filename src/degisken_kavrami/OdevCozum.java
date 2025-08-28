package degisken_kavrami;

public class OdevCozum {
    public static void main(String[] args) {
        //Odev1 cozumu
        String stringDegiskeni = "150"; //primitive deyil referans veri turu, icindeki bilgiye gore bellekde yer ayriliyor
        //Wrapper sinif - Integer
        int integerDegiskeni = Integer.parseInt(stringDegiskeni);
        int integerDegiskeni2 = Integer.valueOf(stringDegiskeni);
        System.out.println(integerDegiskeni);
        System.out.println(integerDegiskeni2);

        stringDegiskeni = String.valueOf(integerDegiskeni);
        System.out.println("stringdegiskeni : "+stringDegiskeni);

        //Odev2

        int    sayi1 = 5 / 3;
        float  sayi2 = 5f / 3f; //float vergulden sonra 7 karakter saklar
        double sayi3 = 5d / 3d;
        System.out.println("integer sayi : " + sayi1);
        System.out.println("float sayi   : " + sayi2);
        System.out.println("double sayi  : " + sayi3);

        System.out.println("****************************************************");
        //Odev4
        int s1 = 1, s2 = 2;
        double ortalama = (s1 + s2) / 2f; //burda beraberlikden sagda olan hisse integer oldugundan netice integer olur, amma (s1+s2)/2d yazilsaydi onda sag teref double olacaqdi
        System.out.println("Ortalama : "+ortalama);
        double ortalama2 = (s1 + s2) / 2.0;
        System.out.println("Ortalama : "+ortalama2);


    }
}
