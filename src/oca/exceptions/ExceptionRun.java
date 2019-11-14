package oca.exceptions;

public class ExceptionRun extends Throwable {
    public static void rand(){
        int i = 1;
        float f = 1.1f;
        double d =1.1;
        char c = 1;
        short s = 1;
//        i = f;//false
//        i = d;//false
//        d =f;//true
//        f=d;//false
//        c =s;// false
//        s=c;//false

boolean tr = false;
boolean fl = false;
if(tr = !fl){
    System.out.println ("true");
}else{
    System.out.println ("false");
}




        System.out.println ("money");
    }
    public static void names() throws ExceptionRun {
        throw new ExceptionRun();
    }
    public static void main(String[] args) {
        try {
            ExceptionRun.names();
        } catch (ExceptionRun e) {
            System.out.println ("error was thrown");
        }
        System.out.println ("still continues");
        ExceptionRun.rand ();


    }
}
