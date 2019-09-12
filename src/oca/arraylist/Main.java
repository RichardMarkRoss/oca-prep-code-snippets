package oca.arraylist;

import java.util.Arrays;

class MinMax {
    public static int[] minMax(int[] arr) {

        int large = 0;
        int small = 1;

        for(int num : arr){
            if (num <= small){
                small = num;
            }
        }

        for(int num : arr){
            if (num >= large){
                large = num;
            }
        }
        int[] value = new int[]{small,large};
        if(small != large){
            return value;
        }else{
            int[] number = new int[]{1,1};
            return number;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MinMax lowBig = new MinMax();
        System.out.println(Arrays.toString(lowBig.minMax(new int[]{1, 2, 3, 4, 5})));

    }
        }
