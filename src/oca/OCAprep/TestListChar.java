package oca.OCAprep;

import java.util.ArrayList;
import java.util.List;

public class TestListChar {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add(0, 'V');
        list.add('T');
        list.add(1, 'E');
        list.add(3, 'O');

        System.out.println(list);
        System.out.println(list.contains('O'));
        if (list.contains('O')) {
            list.remove(list.size() - 1);
//          list.remove('o');      /**(char cast to int in the case of remove...remove only takes objects and int)**/
        }

        for (char ch : list) {
            System.out.print(ch);
        }
    }
}
