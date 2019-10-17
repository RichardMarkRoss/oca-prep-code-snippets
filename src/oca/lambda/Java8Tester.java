package oca.lambda;

public class Java8Tester {

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    public static void main(String args[]) {
        Java8Tester tester = new Java8Tester();

        MathOperation addition = (int a, int b) -> a + b;// ohky so this does the functional programme and returns the answer
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (int a, int b) -> {return a * b;};
        MathOperation division = (int a, int b) -> a / b;
        MathOperation remainder = (int a, int b) -> a % b;

        GreetingService greetService1 = message -> System.out.println("Hello " + message);
        GreetingService greetService2 = (message) -> System.out.println("Hello " + message);

        greetService1.sayMessage("Richard");
        greetService2.sayMessage("Unalo");

        System.out.println("addition: " + tester.operate(10, 5, addition));
        System.out.println("Subtraction: " + tester.operate(10, 5, subtraction));
        System.out.println("multiplication: " + tester.operate(10, 5, multiplication));
        System.out.println("division: " + tester.operate(10, 5, division));
        System.out.println("Renainder: " + tester.operate(10, 5, remainder));
    }
}