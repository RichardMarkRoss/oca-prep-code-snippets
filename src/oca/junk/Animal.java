package oca.junk;


public class Animal {
    private String name;
    private Animal(String name){
        this.name = name;
    }

    Animal(){
        this(makeRandomName());
    }

    static String makeRandomName(){
        int x = (int)(Math.random() * 5);

        return new String[]{"Fluffy", "Fido", "Rover", "Spike", "Gigi"}[x];
    }
    static void makeRandomName(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.name);
        makeRandomName("Richard");

    }
}
