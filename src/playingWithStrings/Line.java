package playingWithStrings;

public class Line {
    public static String WhoIsNext(String[] names, int n) {
//   System.out.print(n);
        int remainder;
        int lenghtnth = 0;
        int setInt = ((names.length + (lenghtnth + n)) + n) % n;
        if (setInt < 10) {
            return names[n % names.length];
        } else if (setInt == 0) {
            return names[names.length - 1];
        } else {
            int value = ((names.length + (lenghtnth + n)) + n) / n;
            remainder = value + (n % (names.length - 1));
            return names[(n % remainder)];
        }
    }
    public static void main(String[] args) {
        String[] names = new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        int n = 63;
        System.out.println(WhoIsNext(names, n));
    }
}