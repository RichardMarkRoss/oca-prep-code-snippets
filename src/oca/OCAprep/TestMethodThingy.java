package oca.OCAprep;

import java.util.ArrayList;

class Counter {
    int count;
    Counter(int count) {
        this.count = count;
    }

    public String toString() {
        return "Counter-" + count;
    }
}

public class TestMethodThingy {
    public static void main(String[] args) {
        ArrayList<Counter> original = new ArrayList<>();
        original.add(new Counter(10));

        ArrayList<Counter> cloned = (ArrayList<Counter>) original.clone();
        cloned.add(new Counter(30));
        cloned.get(1).count = 5;

        System.out.println(cloned);
    }
}
