package main.java.com.hackerrank.solutions.strings;

//TypeCasting can be done from lower to higher data
//byte -> short -> char -> int -> long -> float -> double  (From left to right: Lower data type to Higher data type)

//Integer to String
// int n = 100;
// String s = Integer.toString(n);
// converts 100 of type int to String

// String to Integer
// String s = "200"
// Int t  = Integer.parseInt(s)
// converts 200 of type string to int

import java.util.Scanner;
public class javaStringsIntroduction {
    //Method 1
//    public static void main(String args[]){
//        // Method 1
//        Scanner sc = new Scanner(System.in);
//        String inp1 = sc.nextLine();
//        String inp2 = sc.nextLine();
//        System.out.println(inp1.length() + inp2.length());
//        int a = inp1.compareTo(inp2);
//        if(a<0)
//            System.out.println("No");
//        else
//            System.out.println("Yes");
//       String first  = inp1.substring(0, 1).toUpperCase() + inp1.substring(1)+ " " ;
//       String last   = inp2.substring(0, 1).toUpperCase() + inp2.substring(1);
//       System.out.println(first + last);
//    }
    public static String stringCompare(String str1, String str2)  {
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            if ((int) str1.charAt(i) == (int) str2.charAt(i)) {
                continue;
            }
            if ((int) str1.charAt(i) > (int)str2.charAt(i))
                return "Yes";
            else
                return "No";
        }

        if(str1.length() > str2.length())
            return "Yes";
        else
            return "No";
    }

 public static void main(String args[]) {
     //Method 2
     Scanner sc = new Scanner(System.in);
     String inp1 = sc.nextLine();
     String inp2 = sc.nextLine();
     sc.close();
     System.out.println(inp1.length() + inp2.length());

     System.out.println(stringCompare(inp1, inp2));

     String first  = inp1.substring(0, 1).toUpperCase() + inp1.substring(1)+ " " ;
     String last   = inp2.substring(0, 1).toUpperCase() + inp2.substring(1);
     System.out.println(first + last);

 }
}
