package oca.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Arrays {


//    private static Object ArrayList;

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Vijay");
        list2.add("john");
        list2.add("Ravi");
        list2.add(new String("Killer"));

        list.add("Ravi");
        list.add("Vijay");
        list.add(null);
        list.add("Ajay");
        list.add(new String("Richard"));
        list.removeAll(list2);
        System.out.println(list);
    }
}
