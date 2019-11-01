package oca.package1;

import oca.package2.Other;

public class Test {
    public static void main(String[] args){
        String hello = "Hello", lo = "lo";
        System.out.print((oca.package2.Other.hello == hello) + " ");   //line 2
        System.out.print((hello == ("Hel"+"lo")) + " ");           //line 3
        System.out.print((hello == ("Hel"+lo)) + " ");              //line 4
        System.out.println(hello == ("Hel"+lo).intern());          //line 5
    }
}
