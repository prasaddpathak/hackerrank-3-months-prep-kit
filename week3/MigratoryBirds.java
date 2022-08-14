package week3;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
        Integer[] birdType = new Integer[5];
        for(Integer i = 0 ; i < birdType.length; i++){
            birdType[i] = 0;
        }
        for (Integer i : arr) {
            birdType[i-1]++;
        }
        Integer maxIndex = 0;
        Integer maxCount = 0;
        for (int i = 0; i < birdType.length; i++) {
            // System.out.println(birdType[i]);
            if (birdType[i] > maxCount) {
                maxCount = birdType[i];
                maxIndex = i;
            } 
        }
        return maxIndex + 1;
    }

}

public class SolMigratoryBirdsution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
