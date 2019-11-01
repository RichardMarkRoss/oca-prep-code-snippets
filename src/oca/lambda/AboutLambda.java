package oca.lambda;

import java.util.function.*;

interface MorePredicates{
    int getAge();
    String getGender();
    static void go(Predicate<MoreSheep> e) {}

    static Predicate<MoreSheep> isAdultMale() {
        return p -> p.getAge() > 40 && p.getGender().equalsIgnoreCase("M");
    }
}

class MoreSheep implements MorePredicates {
    @Override
    public int getAge() {
        return 30;
    }

    @Override
    public String getGender() {
        return "M";
    }


    static void  go(Predicate<MoreSheep> e) {
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

    public static void main(String[] args) {
        MoreSheep moreSheep = new MoreSheep();
        boolean values = false;
        boolean result = aFlag = values;
        MoreSheep.go(moreSheep1 -> aFlag);
        MoreSheep.go(moreSheep2 -> true);
    }
}
