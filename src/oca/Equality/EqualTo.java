package oca.Equality;

public class EqualTo {
    public static void main(String[] args) {
        Integer numb1 = 87;
        Integer numb2 = 87;
        Integer numb3 = new Integer(87);

        System.out.print(numb1 == numb2);
        System.out.print(" ");
        System.out.print(numb1 == numb3);
        System.out.print(" ");
        System.out.print(numb1.equals(numb3));
    }
}
