package oca;

 class Car {
    String name = this.toString();
    private static int startCount;

    public static String start() {
        startCount++;
        if(startCount == 2) {
//            continue;
        }

        return "started the car!";
    }



    public static void main(String[] args) {

        Car car1 = new Car();
        car1.start();

        Car car2 = new Car();
        car2.start();

        Car car3 = new Car();
        car3.start();

        Car car4 = new Car();
        car4.start();

        System.out.println(car1.startCount);
    }

}
public class StringFromChar {

    public static void main(String[] args) {
        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd' };

        String newStr = null;
        for(char ch : myCharArr){
            newStr = newStr + ch;
        }

        System.out.println((newStr == myStr)+ " " + (newStr.equals(myStr)));

    }
}