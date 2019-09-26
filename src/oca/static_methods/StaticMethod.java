package oca.static_methods;

public class StaticMethod {
    public static int counter = 0;

    public  void count() {
            counter++;      //counter is not static...static methods can only call static variables
    }

    public static void main(String[] args) {
        Statik.count();
//        count(); // method needs to be static to run
        System.out.print(counter);
        Statik.count();
        System.out.print(Statik.counter);
        System.out.print(counter);
    }
}
