package oca.for_loops;

public class DeepNestedLoop {
    public static void main(String[] args) {
        int number1 = 0, number2 = 0, number3 = 0;
        for (int x = 1; x <= 5; ++x){
            for (int y = 1; y <= 5; ++y){
                for (int z = 1; z <= 5; ++z){
                    number1++;
                }
                number2++;
            }
            number3++;
        }
        System.out.println(number1);
        System.out.println(number3*number2);
    }
}
