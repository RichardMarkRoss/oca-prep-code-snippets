package oca.junk;

import org.w3c.dom.ls.LSOutput;

class Bird{
    {
        System.out.println ("b1");
    }
    protected Bird(){
        System.out.println ("b2");
    }
}

class Raptop extends Bird{
    final int f = 1;
    static {
        System.out.println ("r1");
    }
    protected Raptop(){
        System.out.println ("r2");
    }
    {
        System.out.println ("r3");
    }
    static  {
        System.out.println ("r4");
    }
}

public class InitilizationBlocks extends Raptop {
        int f =7;

        static final String MAX;
    static {
        MAX ="afafd";
    }
       private InitilizationBlocks(){};
    public static void main(String args[]) {
        if (6>5) {
            System.out.println ("zero");
        } else{
            System.out.println (args.length + " args");
        }
        int a,b,c;
        ;
        System.out.println ("hello world".compareTo ("hello world"));
        a = b = c = 100;

        System.out.println ("pre ");
        System.out.println (new InitilizationBlocks ().f);;
        System.out.println ("hawk ");
    }
}
