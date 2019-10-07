package oca.exceptions;

public class ExceptionRun extends Throwable {

    public static void names() throws ExceptionRun {
        throw new ExceptionRun();
    }
    public static void main(String[] args) {
        try {
            ExceptionRun.names();
        } catch (ExceptionRun e) {
            e.printStackTrace();
        }
    }
}
