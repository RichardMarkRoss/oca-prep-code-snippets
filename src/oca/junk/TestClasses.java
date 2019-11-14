package oca.junk;
//import oca.junk.Interfaceses.*;

public class TestClasses implements Interfaceses {

    private TestClasses(int a){
    }
    public static void main(String[] args) {

        int size = 10;
        int[] arr = new int[size];
        for(int i = 0;i<size; i++){
            System.out.println (i);

        }

//            int [] name = new int[0];
//            int [] sur =  new int[0];// arrays are objects
//            boolean[] bo[] =  new boolean[1][];// arrays are objects
//        try {
//
//        }catch(ArithmeticException e){
//            System.out.println ("undefind");
//        }
//            Interfaceses faces = (txf) -> {txf.equals("house");System.out.println ("asd");System.out.println ("knfasdas");};
////            new TestClasses ().TestClasses (3);
//            int[] a = {1,2,3,4};
//            int[] d = {2,3,1,0};
////        System.out.println ((a=d)[3]);
//        System.out.println (a[(a=d)[3]]);//lives inside the scope
//
//
//
//
////        new TestClasses ().sayHello ();
//        house : for (int i = 0; i > 10; i++ ){
//            for (int j = 0; j < 10; j++ ){
//                if(i + j > 10) break house;
//
//            }
//            System.out.println ("hello");
//        }
    }
    public static void sayHello(){
        System.out.println ("static world");
    }

    public void run() {

    }

    @Override
    public void run(String s) {

    }
//    public void sayHello(){
//
//    }
}
