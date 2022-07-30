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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        String ampm = s.substring(8, 10);
        String time = s.substring(2, 8);
        String hr = s.substring(0, 2);
        if(ampm.equals("AM")) {
            if(Integer.valueOf(hr) == 12) return String.valueOf(Integer.valueOf(hr) - 12)+ "0" + time; 
            return hr + time;
        } else if (ampm.equals("PM")){
            if(Integer.valueOf(hr) == 12) return hr + time;
            return String.valueOf(Integer.valueOf(hr) + 12) + time;
        }
        return null;
        // return convertedTime;
    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
