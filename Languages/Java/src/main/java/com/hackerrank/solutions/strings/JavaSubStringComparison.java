package main.java.com.hackerrank.solutions.strings;

import java.util.ArrayList;
import java.util.Scanner;
public class JavaSubStringComparison {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
//       return smallest + "\n" + largest
        ArrayList<String> sub  = new ArrayList<String>();
        int n = s.length();
        for(int i = 0; i <= n - k; i++) {
            System.out.println("i = " + i + " s.length() = " + s.length());
            sub.add(s.substring(i, i + k));
        }
        int noOfWords = sub.size();
        String[] str = new String[sub.size()];
        String name[] = sub.toArray(new String[noOfWords]);

        System.out.println("Before Sorting :" + sub);

        for(int p = 0; p< noOfWords-1; p++ ){
            for(int q = p + 1; q <noOfWords; q++) {
                if (name[p].compareTo(name[q]) > 0) {
                    System.out.println("p = " + p + " q = " + q);
                    String temp = name[p];
                    name[p] = name[q];
                    name[q]=temp;
                    System.out.println("name = " + name);
                }
            }
        }
        System.out.println("After Sorting :" + name);
        smallest = name[0];
        largest = name[noOfWords-1];
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}

