package oca.static_methods;

public class Statik {
    public static int counter = 0;
    Statik(){
        counter++;
    }

    public static void count(){
        counter++;
    }

    public static void main(String[] args) {
        Statik statik;
        statik = new Statik();
        Statik.count();
        statik.count();
        count();
        System.out.println(Statik.counter);
        Statik.count();
        statik.count();
        System.out.println(counter);

    }
}
