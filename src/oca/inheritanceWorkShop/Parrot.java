package oca.inheritanceWorkShop;

public class Parrot extends Bird implements Species{
    Parrot(){
        super();
    }

    public void talk(){

    }

    @Override
    public void move() {
        System.out.println("move forward");
    }
}

