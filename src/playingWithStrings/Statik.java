package playingWithStrings;
class Name{
    public static int counter =0;

    public static void count() {
        counter++;                  // line 7
    }
    public int getCounter(){
        return counter++;
    }
}

public class Statik extends Name{
    public void callCount(){
        count();
    }

    public static void main(String[] args) {
        Statik statik = new Statik();
        statik.callCount();
        Statik.count();
        count();
        int counter = Name.counter++;

        System.out.print(counter);
        System.out.print(statik.getCounter());
        System.out.print(Statik.counter);
    }
}