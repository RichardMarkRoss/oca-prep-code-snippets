package oca.inheritance;

public abstract class PersonWalk{
    private void walk(){
        System.out.println("Person is walking");
    }
    public static void main(String[] args){
//        PersonWalk p = new PersonWalk(); //--> abstract class cannot be instantiated
//        p.walk();
    }
}

class Employee extends PersonWalk{ // never gets used
    protected void walk(){
        System.out.println("Employee is walking");
    }
}