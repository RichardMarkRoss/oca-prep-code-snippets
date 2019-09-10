package oca.inheritance;

interface HasTail{
    int getTailLength();
}

class Puma implements HasTail {
    @Override
    public int getTailLength() {
        return 4;
    }
}
public class Cougar extends Puma{

    public static void main(String[] args) {
        Puma puma = new Puma();
        System.out.println(puma.getTailLength());
    }
    public int getTailLength(int length){
    return 2;
    }

}