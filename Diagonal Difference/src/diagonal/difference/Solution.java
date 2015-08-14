/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagonal.difference;

import java.util.Scanner;

/**
 *
 * @author aorrego
 */
public class Solution {

    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        
        int n = Integer.parseInt(in.nextLine());
        
        int[][] array = new int[n][n];
        
        String[] arrayRows = getArrayRows(n);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = arrayRows[] 
            }
        }
    }

    private static String[] getArrayRows(int n) {
        String[] array =new String[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = in.nextLine();
        }
        
        return array;
    }
    
}
