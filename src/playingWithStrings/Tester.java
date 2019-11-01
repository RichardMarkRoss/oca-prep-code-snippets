package playingWithStrings;

public class Tester{
    static String str = "Hello World";
    public static void changeIt(String s){
        s = "Good bye world";
    }
    public static void main(String[] args){
        changeIt(str);
        System.out.println(str);
    }
}