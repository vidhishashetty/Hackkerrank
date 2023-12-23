package main.java.com.hackerrank.solutions.strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class validUserNameRegularExpression {
    public static String checkValidity(String name){
        int len = name.length();
        if(len>=8 && len<=30){

        }
        return "Invalid";
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n ; i++){
            String name = sc.next();
            checkValidity(name);
        }
    }
}
