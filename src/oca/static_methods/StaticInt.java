package oca.static_methods;

public class StaticInt {
    public static int counterOne = 0;
    public int counterTwo = 0;

    public StaticInt(){
        counterOne++;
        counterTwo++;
    }

    public static int getCounterOne(){
        return counterOne;
    }
    public int getCounterTwo(){
        return counterTwo;
    }

    public static void main(String[] args) {
        StaticInt statik1 = new StaticInt();
        StaticInt statik2 = new StaticInt();
        StaticInt statik3 = new StaticInt();
        StaticInt statik4 = new StaticInt();
        StaticInt statik5 = new StaticInt();

        System.out.print(statik5.getCounterTwo());
        System.out.print(statik5.getCounterOne());
    }
}
