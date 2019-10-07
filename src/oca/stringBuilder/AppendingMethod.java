package oca.stringBuilder;

public class AppendingMethod {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("set ");

        sb.append("point");
        sb.append("richard",0,4);
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("pi = ");
        sb2.append(3.14159f);
        System.out.println(sb2);
    }
}