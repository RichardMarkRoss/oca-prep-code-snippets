package oca.for_loops;

import java.util.Arrays;
class Name {
    {
        System.out.println("non static");
    }
}
public class Loopty {
    static int x = 3;
    static float y = 4.3f;


    static int f = 0;

    public static void main(String[] args) {
        Name name = new Name();

        int i = 0;
        String[] k = new String[]{null};
        String[] j = new String[1];
//        k = j.clone();

        f++;
//        System.out.println(f++);
//        System.out.println(++f);
//        System.out.println(f);

        f += f;
//        System.out.println(f);

        System.out.println(Arrays.equals(k, j)); //true??
//        System.out.println(k);
//        System.out.println(Arrays.toString(k.clone()));

        for (; i < 2; i = i + 5){
            if (i < 5){
                continue;
            }
            System.out.println(i);
        }

        switch (i){
            case 1:
            case 3:
            case 5: {
                System.out.println("odd");
                break;
            }
            case 2:
            case 4:
            case 6:
                System.out.println("even");
                break;
        }
        System.out.println(i);
    }
    {
        System.out.println("static");
    }
}
