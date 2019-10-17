package oca.junk;

import java.util.Arrays;

public class Bingo {
    public static String bingo(int[] numberArray) {

        int[] bingoValue = {2, 7, 9, 14, 15};
        int[] holdArray = new int[5];
        for (int i = 0; i < bingoValue.length; i++) {
            for (int j = 0; j < numberArray.length; j++) {
                if (numberArray[j] == bingoValue[i]) {
                    holdArray[i] = numberArray[j];
                    System.out.println(holdArray[i]);
                }
            }
            }
        if (Arrays.equals(holdArray, bingoValue)) {
            return "WIN";
        } else {
            return "LOSE";
        }
    }

    public static void main(String[] args) {
        int[] numberArray = {14, 7, 9, 2, 15, 18};
        System.out.println(Bingo.bingo(numberArray));
    }
}