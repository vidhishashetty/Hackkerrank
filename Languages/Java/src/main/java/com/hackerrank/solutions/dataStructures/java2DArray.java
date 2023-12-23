package main.java.com.hackerrank.solutions.dataStructures;

import java.util.Scanner;

public class java2DArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] myArray = new int[6][6];
        for(int p = 0; p < 6; p++) {
            for (int q = 0; q < 6; q++) {
                myArray[p][q] = sc.nextInt();
            }
        }
        for(int l=0; l<6; l++){
            for(int m=0; m<6;m++){
                System.out.printf("%d ", myArray[l][m]);
            }
            System.out.println();
        }
        int hourGlass = -64;
//        int current = 0;
        for(int i =0; i<4; i++){
            for(int j=0; j<4; j++){
                 int current = myArray[i][j] + myArray[i][j+1] + myArray[i][j+2]
                                            + myArray[i + 1][j+1] +
                              myArray[i+2][j] + myArray[i+2][j+1] + myArray[i+2][j+2];
                if(current > hourGlass)
                    hourGlass = current;
            }
        }
        System.out.println(hourGlass);
    }
}

