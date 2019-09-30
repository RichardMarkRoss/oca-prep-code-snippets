package oca.wappers;

public class BooleanPrim {
    static boolean val1 = true;
    static Boolean val2 = new Boolean(true);
    static Boolean val3 = true;

    public static void main(String[] args) {
        System.out.println(val2 == val3);//false
        System.out.println((Boolean)val1 == val2);//false
        System.out.println((Boolean)val1 == val3);//true
        System.out.println((Boolean)val1 == val3);//true
        System.out.println(val1 == (boolean) val2);//true
        System.out.println(val1 == val2);//true
        System.out.println(val1 == (boolean) val3);//true
        System.out.println(val2.equals(val1));//true
        System.out.println(val3.equals(val2));//true
    }
}
