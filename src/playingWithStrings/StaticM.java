package playingWithStrings;

class As {
    public static void display() {
        System.out.println("Inside static method of superclass");
    }
}
class Bs extends As {
    Bs(){
        show();
        System.out.println("////////");
    }
    public void show() {
        display();
    }
    public static void display() {
        System.out.println("Inside static method of this class");
    }
}
public class StaticM {
    public static void main(String[] args) {
        Bs b = new Bs();
        Bs.display();
        System.out.println();
        //-/-/-/-/-/-/-/-/-/-//
        As a = new Bs();
        As.display();
    }
}