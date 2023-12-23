package main.java.com.hackerrank.solutions.dataStructures;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int nol = sc.nextInt();
        ArrayList<ArrayList<Integer>> arrOut = new ArrayList<ArrayList<Integer>>(nol);
        for(int i = 0; i<nol; i++){
            int num = sc.nextInt();
            ArrayList<Integer> arrIns = new ArrayList<>(num);
            for(int j=0; j<num; j++){
                arrIns.add(j, sc.nextInt());
            }
            arrOut.add(i, arrIns);
        }
        for(ArrayList<Integer> y : arrOut){
            System.out.printf("pos = %d, value = { ",arrOut.indexOf(y));
            for(int z : y){
                System.out.printf("pos = %d, value = %d, ",y.indexOf(z), z);
            }
            System.out.printf("}%n");
        }
            int query = sc.nextInt();
            for (int k = 0; k < query; k++) {
                try {
                    System.out.println(arrOut.get(sc.nextInt() - 1).get(sc.nextInt() - 1));
                }
                catch (IndexOutOfBoundsException exp){
                    System.out.println("ERROR!");
                }
            }


    }
    }
