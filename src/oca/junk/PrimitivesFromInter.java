package oca.junk;
interface House{
    int name = 3;
}

abstract class Wall implements House {
    void straw(){
        System.out.println ("Straw");
    }
    abstract void brick();
}
public class PrimitivesFromInter extends Wall {
    void brick(){}

    public static void main(String[] args)  {
        House prim = new PrimitivesFromInter ();
        System.out.println (prim);
    }
}


