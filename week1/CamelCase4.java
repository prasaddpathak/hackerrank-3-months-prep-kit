import java.io.*;
import java.util.*;

public class CamelCase4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
            
        while(sc.hasNextLine()){
            String text = sc.nextLine();
            String[] split = text.split(";");
            String SC = split[0];
            String MCV = split[1];
            String data = split[2];
            
            if (SC.equals("C")){
                switch (MCV) {
                    case "M" :
                        String[] dataSplit = data.split(" ");
                        String combineMethod = dataSplit[0];
                        String[] combine = Arrays.copyOfRange(dataSplit, 1, dataSplit.length);
                        
                        for (String s : combine) {
                            String fl = s.substring(0, 1).toUpperCase();                          
                            String remaining = s.substring(1, s.length());                          
                            combineMethod += fl + remaining;
                        }
                        combineMethod += "()";
                        System.out.println(combineMethod);
                        break;
                    case "C" :
                        String[] dataSplitCC = data.split(" ");   
                        String combineMethodCC = "";                     
                        for (String s : dataSplitCC) {
                            String fl = s.substring(0, 1).toUpperCase();                          
                            String remaining = s.substring(1, s.length());                          
                            combineMethodCC += fl + remaining;
                        }
                        System.out.println(combineMethodCC);
                        break;
                    case "V" :
                        String[] dataSplitCV = data.split(" ");
                        String combineMethodCV = dataSplitCV[0];
                        String[] combineCV = Arrays.copyOfRange(dataSplitCV, 1, dataSplitCV.length);
                        
                        for (String s : combineCV) {
                            String fl = s.substring(0, 1).toUpperCase();                          
                            String remaining = s.substring(1, s.length());                          
                            combineMethodCV += fl + remaining;
                        }
                        System.out.println(combineMethodCV);
                        break;    
                }    
            } else if (SC.equals("S")) {
                switch (MCV) {
                    case "M":
                        data = data.replace("()", "");
                        char[] arrSM = data.toCharArray();
                        String sm = "";
                        for (char c : arrSM){
                            // System.out.println(c);
                            if (Character.isUpperCase(c)) {
                                sm += " ";
                                sm += Character.toLowerCase(c);
                            } else {
                                sm += c;
                            }
                        }
                        System.out.println(sm);
                        break;
                    case "C":
                        char[] arrSC = data.toCharArray();
                        String splitC = "";
                        for (char c : arrSC){
                            // System.out.println(c);
                            if (Character.isUpperCase(c)) {
                                splitC += " ";
                                splitC += Character.toLowerCase(c);
                            } else {
                                splitC += c;
                            }
                        }
                        System.out.println(splitC.trim());
                        break;
                    case "V":
                        char[] arrSV = data.toCharArray();
                        String sv = "";
                        for (char c : arrSV){
                            // System.out.println(c);
                            if (Character.isUpperCase(c)) {
                                sv += " ";
                                sv += Character.toLowerCase(c);
                            } else {
                                sv += c;
                            }
                        }
                        System.out.println(sv);
                        break;
                }
                
            }
                        
            // System.out.println(SC);
            // System.out.println(MCV);
            // System.out.println(data);
        }

    }
}
