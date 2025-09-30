package java_hacker_rank_solutions;
import java.util.Scanner;
/*
System.out.println(String.format("%-20s= %s" , "label", "content" ));

    Where %s is a placeholder for you string.
    The '-' makes the result left-justified.
    20 is the width of the first string

The output looks like this:

label               = content

 */
public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {   // assume 3 lines of input
            String s = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s, x);
        }
        System.out.println("================================");
    }
}
