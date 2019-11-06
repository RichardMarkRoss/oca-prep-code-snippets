package oca.for_loops;

public class Loopty {
    static int x = 3;
    static float y = 4.3f;

//    public static void main(String[] args) {
//        for (int z = x; z<++x;z++, y += z){
//            System.out.println(x);
//        }
//    }
        public static void main(String[] args) {

            int i = 0;
            for (; i < 2; i = i + 5) {
                if (i < 5)
                    continue;
                System.out.println(i);
            }
            System.out.println(i);
        }
}
