package oca.wappers;

public class PlayingWithPrim {
    static String str1 = "string";
    static String str2 = new String("string");
    static String str3 = "string";

    static StringBuilder strB1 = new StringBuilder("string");

    public static void main(String[] args) {
        System.out.println("stringbuilder vs string");
        System.out.println(str1 == str2.toString());// false
        System.out.println(str1.toString() == str2);// false
        System.out.println(str1.toString() == str3);// true
        System.out.println(str2.toString() == str3);// false
        System.out.println(str1.equals(str3.toString()));// true
        System.out.println(str1.equals(str2.toString()));// true
    }
}
