package oca.loops;

public class Loopy {
    public static void main(String[] args) {
        int k = 0;
        int i = k++;
        for (; i < 5 ; i++) {
            System.out.print(i);
        }
    }
}