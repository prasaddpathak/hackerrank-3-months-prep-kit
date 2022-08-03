package week2;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long flippingBits(long n) {
    // Write your code here
        String inputBinary = Integer.toBinaryString((int)n);
        String leadingZero = "";
        for (int i=0;i < 32 - inputBinary.length(); i++)
            leadingZero += "0";
        String inputPadded = leadingZero + inputBinary;
        System.out.println(inputPadded);
        char[] inputBinaryCharArray = inputPadded.toCharArray();
        char[] output = new char[32];
        for (int i =0 ; i < 32; i++){
            if (inputBinaryCharArray[i] == '0') {output[i] = '1';}
            else if (inputBinaryCharArray[i] == '1') {output[i] = '0';}
        }
        
        return Long.parseLong(String.valueOf(output), 2);
    }

}

public class FlippingBits {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());

                long result = Result.flippingBits(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
