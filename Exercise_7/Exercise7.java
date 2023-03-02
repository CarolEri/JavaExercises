/*  Coded by Caroline Eri Sato Ushirobira - IBM Software Developer, March 2023.
    07. Two Characters

Simple Input:
10
beabeefeab
*/

import java.util.Scanner;

public class Exercise7{

    public static final int letterNumber = 26;

    public static void main (String[] args){
    
        Scanner scan = new Scanner(System.in);
        System.out.println("\n------Hello, please provide a simple input here:------");
        
        int length = scan.nextInt();
        String str = scan.next();

        if (length <= 1) {
            System.out.println(0);
        }

        //Creating matrices
        int[][] pair = new int[letterNumber][letterNumber];
        int[][] count = new int[letterNumber][letterNumber];

        for (int i = 0; i < length; i++) {
            char letter = str.charAt(i);
            int letterNum = letter - 'a';

            //Updating row
            for (int col = 0; col < letterNumber; col++) {
                if (pair[letterNum][col] == letter) {
                    count[letterNum][col] = -1;
                }
                if (count[letterNum][col] != -1) {
                    pair[letterNum][col] = letter;
                    count[letterNum][col]++;
                }
            }

            //Updating column
            for (int row = 0; row < letterNumber; row++) {
                if (pair[row][letterNum] == letter) {
                    count[row][letterNum] = -1;
                }
                if (count[row][letterNum] != -1) {
                    pair[row][letterNum] = letter;
                    count[row][letterNum]++;
                }
            }
        }

        //Finding max in "count" array
        int max = 0;
        for (int row = 0; row < letterNumber; row++) {
            for (int col = 0; col < letterNumber; col++) {
                max = Math.max(max, count[row][col]);
            }
        }
        System.out.println("The output is: " + max);
    }
}