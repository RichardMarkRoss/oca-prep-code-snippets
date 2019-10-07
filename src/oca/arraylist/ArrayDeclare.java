package oca.arraylist;

import java.lang.reflect.Array;

public class ArrayDeclare {
    static Array[][] array[][];

    public static void main(String[] args) {
        array = new Array[][][][]{{{{}}}};
        System.out.println(array.length);
    }
}
