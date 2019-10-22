package playingWithStrings;

public class Line {
    public static String WhoIsNext(String[] names, int n)
    {
        int remainder;
        int lenghtnth = ((names.length+(n))+n);
        if(lenghtnth <10){
            return names[names.length-1];
        }
        else if(lenghtnth % n == 0){
            return names[names.length-1];
        }else {
           int value = lenghtnth/n;
            System.out.println(value);
           remainder = value+(n % names.length);
            System.out.println(remainder);
            System.out.println(names[(n%remainder)-1]);
           return names[(n%remainder)-1];
//            return names[4];
        }
    }

    public static void main(String[] args) {
        String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
        int n = 1745;
        System.out.println(WhoIsNext(names, n));
    }
}