package week2;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
    // Write your code here
        int[] alpha = new int[26];
        String lowerCaseInput = s.toLowerCase();
        
        for (int i = 0; i < alpha.length; i++) {
            alpha[i] = 0;
        }
        
        for (int i = 0; i < lowerCaseInput.length(); i++) {
            if (lowerCaseInput.charAt(i) == ' ') {
                continue;
            }
            alpha[Integer.valueOf(lowerCaseInput.charAt(i)) - 97]++;
        }
        
        for (int i : alpha) {
            if( i == 0 )    return "not pangram";
        }
        
        return "pangram";
    }

}

public class Pangrams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
