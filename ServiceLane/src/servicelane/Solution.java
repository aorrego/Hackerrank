package servicelane;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
        String freewayTestCases = in.nextLine();        
       
        int n = Integer.parseInt( freewayTestCases.split(" ")[0] );
        int t = Integer.parseInt( freewayTestCases.split(" ")[1] );
        
        int[] width = new int[n];
        
        String widthStr = in.nextLine();
        String[] strArray = widthStr.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            width[i] = Integer.parseInt(strArray[i]);
        }        
        
        String[] testCaseValues = new String[t];
        for (int i = 0; i < t; i++) {
            testCaseValues[i] = in.nextLine();            
        }
        
        processTestCases(testCaseValues, width);        
    }
    
    private static void processTestCases(String[] enterExitIndexes, int[] widths) {
        for (int i = 0; i < enterExitIndexes.length; i++) {            
            int enterIndex = Integer.parseInt( enterExitIndexes[i].split(" ")[0] );
            int exitIndex = Integer.parseInt( enterExitIndexes[i].split(" ")[1] );
            int max = 3;
            for (int j = enterIndex; j <= exitIndex; j++) {
                int segmentWidth = widths[j];
                if (segmentWidth<max) {
                   max = segmentWidth; 
                }
            }
            System.out.println(max);
        }
    }
}
