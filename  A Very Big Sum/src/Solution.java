
import java.math.BigInteger;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aorrego
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int noArrays = Integer.parseInt(in.nextLine());
        
        String arrayNums = in.nextLine();
        
        long result = processSum(arrayNums);
        
        System.out.println(result);
        
    }

    private static long processSum(String arrayNums) {
        
        long result = 0;
        String[] numArrayStrings = arrayNums.split(" ");
        long[] nums = new long[numArrayStrings.length];
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Long.parseLong(numArrayStrings[i]);
        }
        
        for (int i = 0; i < nums.length; i++) {
            result+= nums[i];
        }
        return result;        
    }
    
}
