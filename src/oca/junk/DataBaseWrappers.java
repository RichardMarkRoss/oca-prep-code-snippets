package oca.junk;

class TestClass{
    void probe(int... x) { System.out.println("In ..."); }

    void probe(Integer x) { System.out.println("In Integer"); }

    void probe(long x) { System.out.println("In long"); }

    void probe(Long x) { System.out.println("In LONG"); }

    public static void main(String[] args){
        Integer a = 4;
        int b = 4;
        Long c = 4L;
        long d = 4;
        Float e = 4f;
        String na1 = "Java";
        String na2 = "Java";

        String me1 = na1.substring(0,1);
        String me2 = na2.substring(0,1);
        String me3 = na2.substring(0,4);

        System.out.println(me1 + "" + me2 + "" + me3);

        System.out.println(me1 == me2);
        System.out.println(me1.equals(me2));
        System.out.println(1+2+"3"+4+5);

        new TestClass().probe(a);
        new TestClass().probe(b);
        new TestClass().probe(c);
        new TestClass().probe(d);
    }
}