package oca.OCAprep;

import java.util.function.Predicate;

public class TesstingPredicates {

    static public void main(String[] args) {
        String[] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};
        Predicate<String> p = s -> s.toUpperCase().substring(0, 1).equals("A");
        Predicate<String> k = l -> l.length() > 3;
//        processStringArray(arr, p);
        processStringArray(arr, k);
    }

    private static void processStringArray(String[] arr,Predicate<String> predicate) {
        for (String str : arr) {
            if (predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}
