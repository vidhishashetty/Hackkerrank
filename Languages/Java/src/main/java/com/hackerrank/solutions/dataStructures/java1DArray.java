package main.java.com.hackerrank.solutions.dataStructures;

import java.util.Scanner;
public class java1DArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int myArray[] = new int[n];
        for(int i = 0; i< n;i++)
            myArray[i] = sc.nextInt();
        for(int j : myArray)
        System.out.println(j);
    }
}

