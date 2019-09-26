package oca.static_methods;

public class StaticError {
        public  int counter = 0;

        public static void count() {
//            counter++;      //counter is not static...static methods can only call static variables
        }

        public static void main(String[] args) {
            Statik.count();
            count();
//            System.out.print(counter);
            Statik.count();
            System.out.print(Statik.counter);
//            System.out.print(counter);
        }
}
