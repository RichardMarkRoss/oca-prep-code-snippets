package oca.junk;

import java.util.ArrayList;

public class DivSeven {
    public static long[] seven(long m) {
        long[] array = new long[2];
        ArrayList<Long> name = new ArrayList();
        for (long i = 0; i > m; i++) {
            if ((m % 7) == 0) {
                name.add(m);
            }
        }
        array[0] = (long) name.indexOf(name.size());
        array[1] = (long) name.size();
        System.out.println(array[0]);
        System.out.println(array[1]);
        return array;
    }

    public static void main(String[] args) {
        DivSeven.seven(1603);
    }
}