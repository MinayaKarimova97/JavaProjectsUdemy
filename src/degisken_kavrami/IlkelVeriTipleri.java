package degisken_kavrami;

public class IlkelVeriTipleri {
    public static void main(String[] args) {
        int integerDegiskenDeger = 10;
        double doubleDegiskenDeger = 10.50d;
        short shortVeriTipi = 2000;
        System.out.println("BYTE EN KÜÇÜK DEĞERİ  : " + Byte.MIN_VALUE + "EN BUYUK DEGERI : "+ Byte.MAX_VALUE + "KAC BIT : "+Byte.SIZE);
        System.out.println("SHORT EN KÜÇÜK DEĞERİ : " + Short.MIN_VALUE + "EN BUYUK DEGERI : "+ Short.MAX_VALUE + "KAC BIT : "+Short.SIZE);
        System.out.println("DOUBLE EN KÜÇÜK DEĞERİ : " + Double.MIN_VALUE + "EN BUYUK DEGERI : "+ Double.MAX_VALUE + "KAC BIT : "+Double.SIZE);
    }
}
