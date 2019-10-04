package oca.arraylist;

import java.util.ArrayList;

public class ArrayListInt {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(null);
        list.add(null);
        list.add(new Integer(4),1);
        list.add((7));
        System.out.println(list);
    }
}
