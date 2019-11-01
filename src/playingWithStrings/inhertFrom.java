package playingWithStrings;
interface Methods{
    String b();
}
class A implements Methods{
    final int g = 10;
    public String a(){
        return "A";
    }
    @Override
    public String b() {
        return "interface";
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
        System.out.println(a1.b());//interface

        A a2 = new B();
        System.out.println(a2.g);//10
        System.out.println(a2.a());//B
        System.out.println(a2.b());//interface

        B a3 = new B();
        System.out.println(a3.g);//11
        System.out.println(a3.a());//B
        System.out.println(a3.b());//interface

        A a4 = new C();
        System.out.println(a4.g);//10
        System.out.println(a4.a());//C
        System.out.println(a4.b());//interface

        B a5 = new C();
        System.out.println(a5.g);//11
        System.out.println(a5.a());//C
        System.out.println(a5.b());//interface

        C a6 = new C();
        System.out.println(a6.g);//12
        System.out.println(a6.a());//C
        System.out.println(a6.b());//interface
    }
}

