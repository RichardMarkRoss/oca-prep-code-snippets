package oca.for_loops;

public class Loopy {
    public static void main(String[] args) {
        int k = 0;
        int i = k++;
        System.out.println(i);// print statement does not increment the count
        System.out.println(i);
        System.out.println(i);
        for (; i < 5 ; i++) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println(i);
        System.out.println(i);
        System.out.println(i);

        for(int j = 0; j<5; j+=5 , j--) {// start at zero; condition
            System.out.print("break");
        }
    }

}