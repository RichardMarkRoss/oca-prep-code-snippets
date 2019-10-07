package oca.arraylist;

import java.util.ArrayList;
import java.util.List;

public class TweakList {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("z");
        myList.add("x");
        myList.add(1, "y");
        myList.add(0, "w");
        myList.add(4, "l");// the last value
        System.out.println(myList);

        myList.clear();
        myList.add("b");
        myList.add("a");
        myList.add("c");
        System.out.println(myList);
        System.out.println(myList.contains("a") + " " + myList.contains("x"));

        System.out.println("get 1: " + myList.get(1));
        System.out.println("index of c: " + myList.indexOf("c"));

        myList.remove(1);
        System.out.println("size: " + myList.size() + " contians: " + myList);
    }
}