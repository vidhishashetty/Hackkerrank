package main.java.com.hackerrank.solutions.strings;
import java.util.Scanner;
public class JavaSubString {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String output = s.substring(start, end);
        System.out.println(output);
    }
}
