package oca.static_methods;

public class Toad {
    static int toadCount = 0;
    static String f = new String("F");
    static String z = "F";

    public Toad(){
        toadCount += 1;
    }

    public static void main(String[] args) {
//        new Toad();
//        new Toad();
//        new Toad();
        System.out.println(f.equals(z));
        Toad toad = new Toad();
        System.out.println("the toad count " + toadCount);
    }
}
