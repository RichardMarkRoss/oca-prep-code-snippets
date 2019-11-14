package oca.inheritance.clothing;//package oca.inheritance.clothing.items.*;
//import java.io.IOException;
//import java.io.IOException;
import java.util.*;
import oca.inheritance.clothing.items.Clothing;


interface Collection {
    int val = 3;

    void go();

    public default String getId(){
        return "0000";
    }
}

interface Iterable {
   int val = 3;
    void go();
    char ch = 10;

}

interface List extends Collection, Iterable {
    void go();
    void go(String s);
    String getId();

}

class TheList implements Collection, Iterable{

    @Override
    public void go() {

    }
}


class __ implements Collection{
int _i_n_t_s = 3;

@Override
    public void go() {

    }
}
class A {
}

class AA extends A {
}


public class InterfacesApp extends __ {
    public static void main(String[] args) {
        __ bAse = new __ ();
        Object asf = new java.io.File ("af");
   int name = bAse.val;
   new java.math.MathContext (184);
        A a = new A();
        AA aa = new AA();
        a = aa;
        System.out.println (a);
//        List<String> myList = new ArrayList<>();

//        s1.add("a");
//        s1.add("b");
//        s1.add(1, "c");
//        List s2 = new ArrayList(  s1.subList(1, 1) );
//        s1.addAll(s2);
//        System.out.println(s1);


        Integer i = new Integer(1) ;
        Long m = new Long(1);
        if( i.equals(m)) System.out.println("equal");   // 1
        else System.out.println("not equal");
        boolean b = true||false;
//        Clothing shirt = new TheShirt('L', 129.50);
//        Clothing trousers = new Trousers();
//        shirt.scan();
//
//        Returnable socks = new Socks(false);
//
//        Socks socksTwo;
//
//        socksTwo = (Socks) socks;
//
//        Clothing priceyShirt = new TheShirt('M', 987.00);
//
//        Shirt thePriceyShirt = (Shirt)priceyShirt;
//
////        Returnable theReturnableShirt = (Shirt)priceyShirt;
//
//        System.out.println( socks instanceof Returnable  );
//        System.out.println( socks instanceof Clothing  );
//
//        ((Clothing)socks).getPrice();
//
//        // why is getPrice not available on socks...
//
//        System.out.println(((Clothing)socks).getPrice());;
//
//        trousers.getPrice();
        switch(Integer.parseInt(args[1]))  //1
        {
            case 0 :
//                boolean b = false;
                break;

            case 1 :
//                b = true; //2
                break;
        }
//        byte b = -128 ;
//        int i = 0 ;
//        b = (byte) i;
//        System.out.println (b);
    }

    @Override
    public void go() {

    }
}
