package main.java.com.hackerrank.solutions.introduction;

import java.util.Scanner;

public class JavaStdinAndStdoutl {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        for(int i = 0; i<num; i = i+1){
            int a =  sc.nextInt();
            System.out.println(a);
        }
    }
}
