package main.java.com.hackerrank.solutions.strings;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class javaStringTokens {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//        scan.close();
        String s = "He is a very very good boy, isn't he?";
        String[] afterSplit = s.trim().split("[ !,?._'@]");
        System.out.println(afterSplit.length);
        for(String i : afterSplit){
            System.out.println(i) ;
        }

        List<String> nonEmpty =  Arrays.stream(afterSplit).filter(ele -> !ele.isEmpty()).collect(Collectors.toList());
        String[] afterSplitFilter =  nonEmpty.toArray(new String[nonEmpty.size()]);
        System.out.printf("%n%n After Filter%n");
        System.out.println(afterSplitFilter.length);
        for(String j : afterSplitFilter){
            System.out.println(j);
        }

    }
}
