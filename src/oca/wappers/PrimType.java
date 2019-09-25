package oca.wappers;

import oca.inheritance.B;

public class PrimType {
    static int num1 = 4;
    static Integer num2 = new Integer(4);
    static Integer num3 = 4;

    static boolean val1 = true;
    static Boolean val2 = new Boolean(true);
    static Boolean val3 = true;

    static String str1 = "string";
    static String str2 = new String("string");
    public static void main(String[] args) {
        System.out.println("numbers");
        System.out.print(num1 == num2);
        System.out.print(num1 == num3);
        System.out.println(num2 == num3);
        System.out.println("boolean");
        System.out.print(val1 == val2);
        System.out.print(val1 == val3);
        System.out.println(val2 == val3);
        System.out.println("string");
        System.out.print(str1 == str2);
    }
}
