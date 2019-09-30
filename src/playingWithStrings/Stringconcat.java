package playingWithStrings;

public class Stringconcat {
    public static void main(String[] args) {
        String name = "Richard ";
        String surname = "Ross";
        int num = 1;
        StringBuilder middle = new StringBuilder("mark");
        System.out.println(name.concat(surname));
        System.out.println(name.concat("mark") + surname);
        System.out.println(name.concat(String.valueOf(num)));
        System.out.println(name.concat(middle.toString() + surname.concat(name)));
    }
}
