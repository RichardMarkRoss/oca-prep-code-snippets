package oca.MathCauseKatas;

import java.math.*;

public class SumFct {
    public static BigInteger perimeter(BigInteger n){
        BigInteger n1 = BigInteger.valueOf(0);
        BigInteger n2 = BigInteger.valueOf(1);
        BigInteger n3 = BigInteger.valueOf(0);
        BigInteger n4 = BigInteger.valueOf(0);

        long value = Long.parseLong(String.valueOf(n));

        for (int i = 0; i < value; i++){
            n3 = n2.add(n1);
            n1 = n2;
            n2 = n3;
            n4 = n4.add(n3);
        }
        return new BigInteger(String.valueOf((n4.add(BigInteger.valueOf(1))).multiply(BigInteger.valueOf(4))));
    }

    public static void main(String[] args){
        System.out.println(SumFct.perimeter(BigInteger.valueOf(500)));
    }
}

