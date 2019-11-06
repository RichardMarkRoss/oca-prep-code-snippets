package oca.junk;
interface Mammals {
    int number = 1;
    static void eat() {
        System.out.println("rich");
    }
}
class Anim implements Mammals {
    private int num = 0;
    Anim() {
        super();
    }
//    public void eat() {
//        this.num = number;
//        System.out.println(num);
//    }
}

class AnimalGather extends Anim {
//    public void eat() {
//        System.out.println("unalo");
//    }
    public static void main(String[] main) {
        Anim a = new AnimalGather();
    //    a.eat();
        Mammals.eat();
    }
}

