package oca.MathCauseKatas;

import java.math.*;

public class SumFct {
    public static BigInteger perimeter(BigInteger n){
        long n1 = 0;
        long n2 = 1;
        long n3 = 0;
        long n4 = 0;
        long value = Long.parseLong(String.valueOf(n));
//        System.out.println(value);
        for (int i = 0; i < value; i++){
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            n4 += n3;
        }
//        String form = String.valueOf((n4+1)*4);
        return new BigInteger(String.valueOf((n4+1)*4));
    }

    public static void main(String[] args){
        System.out.println(SumFct.perimeter(BigInteger.valueOf(500)));
    }
}

