package main.java.com.hackerrank.solutions.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class javaSubArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int x =0; x < n; x++){
            if(sc.hasNextInt()){
                arr[x] = sc.nextInt();
            }
        }
        ArrayList<Integer> sub  = new ArrayList<>(n*(n+1)/2);
        for(int i = 0; i < n; i++){
            for(int j = i +1; j <= n; j++){
                sub.add(Arrays.stream(Arrays.copyOfRange(arr, i, j)).sum());

            }
        }
       long count =  sub.stream().filter(ele -> ele<0).count();
        System.out.println(count);

    }

}
