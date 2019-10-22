package playingWithStrings;

class A{
    final int g = 10;
    public String a(){
        return "A";
    }
}

class B extends A{
    final int g = 11;
    public String a(){
        return "B";
    }
}
class C extends B{
    final int g = 12;
    public String a(){
        return "C";
    }
}

public class inhertFrom {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.g);//10
        System.out.println(a1.a());//A

        A a2 = new B();
        System.out.println(a2.g);//10
        System.out.println(a2.a());//B

        B a3 = new B();
        System.out.println(a3.g);//11
        System.out.println(a3.a());//B

        A a4 = new C();
        System.out.println(a4.g);//10
        System.out.println(a4.a());//C

        B a5 = new C();
        System.out.println(a5.g);//11
        System.out.println(a5.a());//C

        C a6 = new C();
        System.out.println(a6.g);//12
        System.out.println(a6.a());//C
    }
}

