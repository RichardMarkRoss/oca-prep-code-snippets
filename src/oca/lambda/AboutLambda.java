package oca.lambda;

import java.util.function.Predicate;

class MoreSheep {
    void go(Predicate<MoreSheep> e) {
        MoreSheep sheep = new MoreSheep();
        if (e.test(sheep)) {
            System.out.println("it is true");
        } else {
            System.out.println("it is false");
        }
    }
}

public class AboutLambda {
    static boolean aFlag = true;
    static String aStringFlag = "";

    public static void main(String[] args) {
        MoreSheep moreSheep = new MoreSheep();
        boolean result = aFlag = false;
        int car = 30;
//        boolean name = name1 -> (name1 == 11) : false ? true;
        moreSheep.go(moreSheep1 -> aFlag);
   }
}
