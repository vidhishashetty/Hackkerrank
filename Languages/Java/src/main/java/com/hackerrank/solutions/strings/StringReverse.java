package main.java.com.hackerrank.solutions.strings;

import java.util.Scanner;
public class StringReverse {

    public static String palindromeCheck(String str) {
        int len = str.length();
        Boolean isPalindrome = true; //Assume its Palindrome

        for (int i = 0, j = len - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome ? "Yes" : "No";
    }
    public static void main(String args[]) {
//        String str = "helooptytut";
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(palindromeCheck(str));

    }
}
