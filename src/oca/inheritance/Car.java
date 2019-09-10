package oca.inheritance;

public class Car {

    private boolean go = false;
    private int speed = 0;

    public void accellerate(){

        accellerate(100);

    }

    public void accellerate(int speed) {
        go = true;
        this.speed = speed;
    }
    public int getSpeed(){
            return this.speed;
    }

    public static void main(String[] args) {

        Car car = new Car();
        car.accellerate();
        System.out.println(car.getSpeed());
    }

}
