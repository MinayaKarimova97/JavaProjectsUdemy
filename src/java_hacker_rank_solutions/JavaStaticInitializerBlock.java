package java_hacker_rank_solutions;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaStaticInitializerBlock {
    private static final Scanner sc = new Scanner(System.in);
    public static int B = sc.nextInt();
    public static int H = sc.nextInt();
    public static boolean flag;

    static {
        if(B > 0 && H > 0)
        {
            flag = true;
        }
        else if(B < 0 || H < 0)
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }
}