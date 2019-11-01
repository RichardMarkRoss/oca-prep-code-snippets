package oca.lambda;

import java.util.function.Function;
import java.util.function.Predicate;
public class AboutLambdas2 {
    public static void main(String[] args) {

        Function<String, Integer> doIt = (name) -> name.length();
        Function<Integer, String> check = (len) -> len > 6 ? "long" : "short";
        Function<String, String> checked = (len) -> len.equals("house") ? "long" : "short";

        Predicate<String> biggerThanFive = (name) -> name.length() > 5;
        Predicate<String> startsWithA = (name) -> name.startsWith("A");

        startsWithA.and(biggerThanFive).test("Andre");

        System.out.println(check.compose(doIt).apply("Andre"));
        System.out.println(check.compose(doIt).apply("Richard"));
        String username = "Andre";
        String username1 = "Richard";
        System.out.println(biggerThanFive.negate().and(startsWithA).test("Andre"));
        if (biggerThanFive.negate().test(username)){
            System.out.println("not bigger than 5");
        }
    }
}
