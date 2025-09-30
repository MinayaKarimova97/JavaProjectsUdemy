package java_hacker_rank_solutions;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaLoops1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int result = 0;

        for (int i = 1; i<=10; i++){
            result = N * i;
            System.out.println(Integer.toString(N) + " x " + Integer.toString(i) +
                    " = " + Integer.toString(result));
        }

        bufferedReader.close();
        /*
            Both should be closed after use (scanner.close() or br.close()), but:
            Closing a Scanner on System.in also closes System.in → can’t reuse it.
            Often developers don’t close it if reading from keyboard.
            Same with BufferedReader
         */
    }
}
