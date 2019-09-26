package oca.static_methods;

public class Statik {
    public static int counter = 0;

    public static void count(){
        counter++;
    }

    public static void main(String[] args) {
        Statik.count();
        count();
        System.out.println(counter);
        Statik.count();
        System.out.println(Statik.counter);
        System.out.println(counter);
    }
}
