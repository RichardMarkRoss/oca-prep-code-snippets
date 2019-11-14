package oca.junk;

import oca.inheritanceWorkShop.Animal;

class AnimalBase{
    void eat(){
        System.out.println ("i am an animal");
    }
}

class Horse extends AnimalBase{
    @Override
    void eat() {
        System.out.println ("i am a horse");
    }
}
public class AnimalMain extends Horse {
    public static void main(String[] args) {
        AnimalBase name = new Horse ();
        name.eat();
    }
}
