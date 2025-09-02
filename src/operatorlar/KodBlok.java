package operatorlar;

public class KodBlok {
    public static void main(String[] args) {
        int kodBlok1 = 20;
        {
            int sayi1 =2;
            int a = 3;
        }
        System.out.println(kodBlok1);

        int kodBlok2 = 0;
        {
            int b = 88;
            System.out.println(kodBlok1);
            System.out.println(kodBlok2);
            {
                int a = 0;
                System.out.println(kodBlok2);
                System.out.println(b);
            }
        }
        System.out.println(kodBlok2);
        
    }
}
