package oca.exceptions;

public class AboutFinally {

    public static void doStuff() throws Exception {
        System.out.println("method exception");
        throw new Exception();
    }

    public static void main(String[] args) {
        try {
            System.out.println("This will print");
            doStuff();
//            new ExcepCheck();
            System.out.println("This will not print!");
        } catch(Exception ex) {
            System.out.println("there was an exception");
        } finally {
            System.out.println("Do this finally");
        }
        System.out.println("This will print");
    }


}
