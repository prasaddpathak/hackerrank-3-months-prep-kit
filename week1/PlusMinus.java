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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        DecimalFormat df = new DecimalFormat("0.000000");
        Integer size = arr.size();
        Double plusIntegers = 0.0;
        Double minusIntegers = 0.0;
        Double zeroIntegers = 0.0;
        
        for (Integer i : arr) {
            if (i > 0) plusIntegers++;
            else if (i < 0) minusIntegers++;
            else zeroIntegers++;
        }
        
        System.out.println(df.format(plusIntegers/size));
        System.out.println(df.format(minusIntegers/size));
        System.out.println(df.format(zeroIntegers/size));

    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
