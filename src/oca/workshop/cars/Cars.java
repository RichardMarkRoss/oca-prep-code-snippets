package oca.workshop.cars;

import java.util.ArrayList;

class Vehical{
//    private ArrayList wheel = new ArrayList()[];
    public void start(){

    }
//    public void addWhell(Wheel wheel){
//    }
//    public ArrayList<Wheel> getWheels(){
//        return wheels;
//    }

}

class Car extends Vehical{

}
class SmallCar extends Car{

}
class SportCar extends Car{

}
class Bakkie extends Vehical{
    public void start(){
        System.out.println("start");
    }
    public void load(){
        System.out.println("bakkie take load");
    }
}
class SmallBakkie extends Bakkie{
    public void load(){
        System.out.println("bakkie take small laod");
    }
}
class FourByFour extends Bakkie{
    public void load(){
        System.out.println("bakkie take heavy load");
    }
}
public class Cars {
    public static void main(String[] args) {
        FourByFour fourByFour = new FourByFour();
        Bakkie fourByFourBakkie = fourByFour; // ------------------
        Vehical fourByFourBakkieVehical = fourByFourBakkie;//------ polymorphism
        Object myObjectBakkie = fourByFourBakkieVehical;//---------

        Bakkie bakkie1 = new SmallBakkie();
        bakkie1.start();
        Bakkie bakkie2 = new FourByFour();
        bakkie2.start();

        Vehical vehical = new FourByFour();

        Vehical vehical1 = new Car();

        Bakkie newBakkie = (Bakkie) vehical1;//runtime: class cast exception. although it extends the same superclass.



    }
}
