package oca.for_loops;

public class NewLoop {
    public static void main(String[] args) {
        int[][] multiD = new int[5][];
        for (int i = 0; i < multiD.length; i++) {
            multiD[i] = new int[i + 1];
            System.out.println(multiD[i]);
            System.out.print(multiD[i].length);
        }
    }
}
