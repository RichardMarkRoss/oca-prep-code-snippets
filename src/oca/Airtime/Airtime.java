package oca.Airtime;

import java.lang.reflect.Array;

public class Airtime {

    private double balance;

    public void  topUp(double balance) {
        balance = this.balance;// 0.0
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        int[] numberArray = {14, 7, 9, 2, 15, 18};
        int[] bingoValue= {2,7,9,14,15};
        int[] holdArray = new int[5];
        for (int i=0; i<bingoValue.length; i++) {
            for(int j = 0 ; j< numberArray.length; j++){
             if(numberArray[j] == bingoValue[i]){
                 holdArray[i] = numberArray[j];
             }
             if(holdArray.equals(bingoValue)){
//                 return "WIN";
             }else{
//                 return "LOSE";
             }
            }
        }
      }
}