package oca.junk;


public class Animal {
    private String name;
    private Animal(String name){
        this.name = name;
    }

    private Animal(){
        this(makeRandomName());
    }

    private static String makeRandomName(){
        int x = (int)(Math.random() * 5);

        return new String[]{"Fluffy", "Fido", "Rover", "Spike", "Gigi"}[x];
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.name);
    }
}
