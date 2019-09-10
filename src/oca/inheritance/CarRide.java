package oca.inheritance;
class Persons{
    int wealth = 800000;
    void purchase(){
        System.out.println("accepted");
    }
}
class Vehicle extends Persons{
    String brand = "Ford";
    public void honk(){
        System.out.println("Tuut, tuut!");
    }
}

public class CarRide extends Vehicle{
    private String modelName = "Mustang";
    public static void main(String args[]) {
        CarRide myCar = new CarRide();
        myCar.purchase();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName + " R" + myCar.wealth);
    }
}