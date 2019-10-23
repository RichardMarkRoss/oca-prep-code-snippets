package playingWithStrings;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(2));
        list.add(new Integer(1));
        list.add(0);

        list.remove(list.indexOf(1));
        list.remove(0);

        System.out.println(list);
    }

}

