package oca.javaApi;

public class StringIntern {
    public static void main(String[] args) {
        String hello = "Hello";
        String lo = "lo";
        System.out.print((oca.javaApi.Other.hello == hello) + " ");
        System.out.print((oca.javaApi.Other.hello == hello) + " ");
        System.out.print((hello == ("Hel" + "lo")) + " ");
        System.out.print((hello == ("Hel" + lo)) + " ");
        System.out.println(hello == ("Hel" + lo).intern());
        System.out.println(("Hel" + lo).intern());
    }

}

class Other {
    static String hello = "Hello";
}
