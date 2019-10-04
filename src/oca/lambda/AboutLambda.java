package oca.lambda;

import java.util.function.Predicate;

class MoreSheep {
    void go(Predicate<MoreSheep> e) {
        MoreSheep sheep = new MoreSheep();
        if (e.test(sheep)){
            System.out.println("true ");
        } else {
            System.out.println("false ");
        }
    }
}
public class AboutLambda {
    static boolean aFlag = true;
    static String aStringFlag = "";

    public static void main(String[] args) {

        boolean result = aFlag = false;
        System.out.println(result);

        String resultString = aStringFlag = "abc";
        System.out.println(resultString);
    }

}
