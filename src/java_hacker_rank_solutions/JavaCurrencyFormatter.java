package java_hacker_rank_solutions;
import java.util.*;
import java.text.*;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();


// Get the currency USA instance
        NumberFormat nF_us = NumberFormat.getCurrencyInstance();
        nF_us.setCurrency(Currency.getInstance(Locale.US));
        String us = nF_us.format(payment);

        // Get the currency India instance
        Locale enIndia = new Locale("en", "IN");
        NumberFormat nF_india = NumberFormat.getCurrencyInstance(enIndia);
        //nF_india.setCurrency(Currency.getInstance(Locale.enIndia));
        String india = nF_india.format(payment);

        // Get the currency China instance
        Locale enChinese = new Locale("zh", "CN");
        NumberFormat nF_china = NumberFormat.getCurrencyInstance(enChinese);
        //nF_china.setCurrency(Currency.getInstance(Locale.CHINESE));
        String china = nF_china.format(payment);

        // Get the currency France instance
        Locale enFrance = new Locale("fr", "FR");
        NumberFormat nF_france = NumberFormat.getCurrencyInstance(enFrance);
        //nF_france.setCurrency(Currency.getInstance(Locale.FRENCH));
        String france = nF_france.format(payment);

        System.out.println("US: "    + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
