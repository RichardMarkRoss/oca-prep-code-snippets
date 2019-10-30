package oca.inheritanceWorkShop;

public class Main {
    public static void main(String[] args) {
        Animal nemo = new Fish();
        System.out.println(nemo instanceof Animal);
        System.out.println(nemo instanceof Fish);


        Parrot parrot=new Parrot();
        Animal animal = new Animal();
        System.out.println(nemo instanceof Parrot);
        nemo.eat();
        Fish dora = (Fish)nemo;
        dora.swim();
        nemo.eat();
        parrot.move(); // print form the interface
        parrot.talk();
        parrot.eat();
        parrot.fly();
    }
}
