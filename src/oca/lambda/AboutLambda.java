package oca.lambda;

import java.util.function.Predicate;
interface MorePredicates{

    int getAge();
    String getGender();
    static void go(Predicate<MoreSheep> e) {}
    static Predicate<MoreSheep> isAdultMale() {
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
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
        MorePredicates sheep = new MoreSheep();
        if (e.test((MoreSheep) sheep)) {
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
        MoreSheep.go(moreSheep1 -> aFlag);
        MoreSheep.go(moreSheep1 -> true);


   }
}
