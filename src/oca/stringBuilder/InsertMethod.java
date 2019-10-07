package oca.stringBuilder;

public class InsertMethod {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("01234567");
        sb.insert(4,"---");
        System.out.println(sb);
    }
}
