package playingWithStrings;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(100000);
        StringBuilder sb1 = new StringBuilder("100000");
        System.out.println(sb.length() + ":" + sb.toString().length());
        System.out.println(sb1.length() + ":" + sb1.toString().length());
        System.out.println(sb1.toString() + ":" + sb1.length());
    }
}
