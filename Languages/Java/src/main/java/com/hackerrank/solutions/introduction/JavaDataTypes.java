package main.java.com.hackerrank.solutions.introduction;

import java.util.Scanner;
public class JavaDataTypes {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        for(int i = 0; i<in; i++){
            try {
                long a = sc.nextLong();
                System.out.printf("%d can be fitted in:%n", a);
                if(a>= Byte.MIN_VALUE && a<=Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if(a>= Short.MIN_VALUE && a<=Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if(a>= Integer.MIN_VALUE && a<=Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if(a>= Long.MIN_VALUE && a<=Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            }
            catch(Exception exp){
                System.out.printf(sc.next()+ " can't be fitted anywhere. %n");

            }
        }
    }
}