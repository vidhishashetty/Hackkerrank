package main.java.com.hackerrank.solutions.introduction;


import java.util.Scanner;
import java.lang.Math;
public class JavaLoopsII {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int j=0;j<t;j++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int total = a;
            String y = "";
            for(int i = 0; i<n; i ++){
                double x = Math.pow(2, i) * b ;
                total =(int)(total + x);
                y = y + total + " ";

            }
            System.out.println(y.trim());
        }
    }
}