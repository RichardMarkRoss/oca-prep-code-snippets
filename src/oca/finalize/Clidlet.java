package oca.finalize;

class Clidder {
    private final void flipper() {
        System.out.println("clidder");
    }
}

public class Clidlet extends Clidder {
    public final void flipper(){
        System.out.println("clidlet");
    }

    public static void main(String[]args){
            new Clidlet().flipper();
    }
}
