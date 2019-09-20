package oca.junk;

class PenDrive{
    int capacity;
    PenDrive(int capacity){
        this.capacity = capacity;
    }
}
class OTG extends PenDrive{
    String type;
    OTG(String type){        // method does not run
        super(32);
        this.type = type;
    }
    OTG(int capacity, String type){
        super(capacity);
        this.type = type;
    }

}
public class Test {
    public static void main(String[] args) {
        OTG obj = new OTG(128,"TYPE-C");
        System.out.println(obj.capacity + ";" +obj.type);
    }
}
