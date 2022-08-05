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
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
    // Write your code here
        char[] paths = path.toCharArray();
        int valleyCount = 0 ;
        int level = 0;
        int conseqDownCount = 0;
        char previousStep = '0';
        boolean countingValley = false;
        for (char c : paths) {
            if (c == 'U') {
                level++;
                conseqDownCount = 0;
                if (level == 0) {countingValley = false;valleyCount++;}
            }
            else if (c == 'D') {
                level--;
                if  (level < 0) {conseqDownCount++;}
                if  (conseqDownCount == 2 && previousStep == 'D') {
                    if (!countingValley) {
                        countingValley = true;   
                    }
                }
            }
            previousStep = c;
        }
        return valleyCount;
    }
}

public class CountingValleys {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
