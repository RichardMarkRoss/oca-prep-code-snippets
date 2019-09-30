package oca.wappers;

public class PlayingWithPrim {
    static String str1 = "string";
    static String str2 = new String("string");
    static String str3 = "string";

    static String str4 = "str";
    static String str5 = "ing";
    static String str6 = str4.concat(str5);

    static StringBuilder strB1 = new StringBuilder("string");
    static StringBuilder strB2 = new StringBuilder("str");
    static StringBuilder strB3 = new StringBuilder("ing");
    static StringBuilder strB4 = strB2.append(str3);

    public static void main(String[] args) {
        System.out.println("stringbuilder vs string");
        System.out.println(str1 == str2.toString());// false
        System.out.println(str1.toString() == str2);//  false
        System.out.println(str1.toString() == str3);// true
        System.out.println(str2.toString() == str3);// false
        System.out.println(str1.equals(str3.toString()));// true
        System.out.println(str1.equals(strB1.toString()));// true
        System.out.println(strB1.equals(str1));//false
        System.out.println("Word play");
        System.out.println(str3 == str6);//false
        System.out.println(str3.equals(str6));//true
        System.out.println((str4+str5) == str6);//false
        System.out.println((str4+str5).equals(str6));//true
        System.out.println((str4+str5) == "string");//false
        System.out.println((str4+str5).equals("string"));//true
        System.out.println(str6 == "string");//false
        System.out.println(str4.equals(new StringBuilder("string")));//false
        System.out.println(str1.equals(str4));//false
    }
}
