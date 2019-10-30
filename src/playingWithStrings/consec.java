package playingWithStrings;

import java.util.ArrayList;
import java.util.List;

class Consecutives {
    public static List<Integer> sumConsecutives(List<Integer> s) {
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < s.size(); i++) {
            int addedValue = 0;
            for (int k = 0; k < s.size(); k++) {
                if (s.get(k).equals(s.get(i))) {
                    addedValue = addedValue + s.get(k);
                }
            }
            s.remove(i);
            values.add(addedValue);

        }
        return values;
    }
}

public class consec {
    public static void main(String[] args) {
        List<Integer> name = new ArrayList<>();
        name.add(1);
        name.add(-5);
        name.add(-5);
        name.add(-5);
        name.add(-3);
        name.add(-3);
        name.add(-3);
        name.add(1);
        name.add(1);
        System.out.println(Consecutives.sumConsecutives(name));
    }
}
