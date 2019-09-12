package oca.junk;

class Run {

    public static String camelCase(String str) {
        String name = "";
        StringBuilder s1 = new StringBuilder();

        if (str.isEmpty()){
            return name;
        }

        String[] array = str.split("[\\s|\\u00A0]+", -1);
        System.out.println(array[0]);
        for(String value : array) {
            value = Character.toUpperCase(value.charAt(0)) + value.substring(1);
            s1.append(value);
//            System.out.println(s1.toString());
        }
        return s1.toString();
    }
}
public class Solution{
    public static void main(String[] args) {
        Run.camelCase(" richard mark ross");
    }
}
