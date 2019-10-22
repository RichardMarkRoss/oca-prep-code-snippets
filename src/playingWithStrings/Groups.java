package playingWithStrings;

import java.util.LinkedList;

public class Groups {
    public static boolean groupCheck(String s){
        if (s.length() % 2 > 0) {
            return false;
        }

        LinkedList<Character> symbolsStack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                symbolsStack.addLast(s.charAt(i));
            } else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                switch (s.charAt(i)) {
                    case ')':
                        if (symbolsStack.getLast() != '(') {
                            return false;
                        }
                        break;
                    case '}':
                        if (symbolsStack.getLast() != '{') {
                            return false;
                        }
                        break;
                    case ']':
                        if (symbolsStack.getLast() != '[') {
                            return false;
                        }
                        break;
                }
                symbolsStack.removeLast();

            }
        }
        return symbolsStack.isEmpty();
    }


    public static void main(String[] args) {
        System.out.println(groupCheck("([]{})"));
        System.out.println(groupCheck("([]})"));
        System.out.println(groupCheck("([{]})"));
        System.out.println(groupCheck("([][])([])){{))"));
        System.out.println(groupCheck("){{))"));
        System.out.println(groupCheck("{(})"));
    }
}
