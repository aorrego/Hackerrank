package validpanformat;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noTestCases = Integer.parseInt(in.nextLine());
        String[] pans = new String[noTestCases];
        for (int testCase = 0; testCase < noTestCases; testCase++) {
            pans[testCase] = in.nextLine();
        }
        
        processPANs(pans);
    }

    private static void processPANs(String[] pans) {
        for (String pan : pans) {
            if (isValidPAN(pan)) {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
    
    private static boolean isValidPAN(String pan){
        
        Pattern pattern = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");
        
        Matcher matcher = pattern.matcher(pan);            
        return matcher.matches();       
    }
}
