package oca.wappers;

public class IntPrim {
    static int num1 = 4;
    static Integer num2 = new Integer(4);
    static Integer num3 = 4;

    public static void main(String[] args) {
        System.out.println(num2 == num3);//false
        System.out.println((Integer)num1 == num2);//false
        System.out.println((Integer)num1 == num3);//true
        System.out.println((Integer)num1 == num3);//true
        System.out.println(num1 == (int) num2);//true
        System.out.println(num1 == num2);//true
        System.out.println(num1 == (int) num3);//true
        System.out.println(num2.equals(num1));//true
        System.out.println(num3.equals(num2));//true
    }
}
