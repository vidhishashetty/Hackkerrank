package main.java.com.hackerrank.solutions.strings;

public class javaAnagrams {
    public static String sort(String str){
        StringBuffer sb = new StringBuffer(str);
        for(int i = 0; i < sb.length() - 1; i++){
            for(int j = i+1 ; j < sb.length(); j ++){

                if((Character.toString(sb.charAt(i))
                        .compareToIgnoreCase(Character.toString(sb.charAt(j)))) > 0){
                    String temp =  Character.toString(sb.charAt(i));
                    sb.replace (i, i+1, Character.toString(sb.charAt(j)));
                    sb.replace(j, j + 1, temp);
                }
            }
        }
        return sb.toString();
    }
    public static String anagramsCheck(String a, String b){
        if(a.length() == b.length()){
            System.out.println(sort(a));
            System.out.println(sort(b));
            if(sort(a).compareToIgnoreCase(sort(b)) == 0)
                return "Anagram";
        }
            return "Not Anagram";
    }

    public static void main(String args[]){
        String a = "anagramm";
        String b = "marganaa";
        System.out.println(anagramsCheck(a, b));

    }
}
