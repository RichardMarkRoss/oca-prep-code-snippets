package oca.junk;
interface Pow{
    static void wow(){
        System.out.println("In Pow.wow");
    }
    void boom();
}
class Wow implements Pow{
    int name = 4;
    static void wow(){
        System.out.println("In Wow.wow");
    }
    public void boom() {
        System.out.println("Wow in the Now");
    }
}
class Now extends Wow{
    int name = 7;
    static void wow(){
        System.out.println("In Now.wow");
    }
    public void boom() {
        System.out.println("Boom in the Now");
    }
}
public class Powwow extends Wow implements Pow{
    public static void main(String[] args) {
        Pow pow = new Now();
        Pow now = new Wow();
        Wow wow = new Wow();
        
        pow.boom();
        now.boom();
        wow.boom();
        wow.boom();
        Powwow.wow();
    }
    public void boom(){
        System.out.println("Boom in the Powwow");
    }
}
