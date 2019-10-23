package oca.constructors;

class OuterClass {
     static int x;
     OuterClass() {
        x += 7;
        System.out.println("age");
    }
}

public class MyClass extends OuterClass {
    static int x;
    MyClass(){
        x+=5;
        System.out.println("name");
    }
    public static void main(String[] args) {
        MyClass myObj = new MyClass();// age name
        OuterClass outObj = new MyClass(); //age name
        OuterClass mainObj = new OuterClass(); //age
        System.out.println(x);//10
        System.out.println(OuterClass.x);//10
    }
}
