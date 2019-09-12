package oca.junk;

class Main {
    public static boolean scramble(String str1, String str2) {
        StringBuilder store = new StringBuilder();

        for (int j =0; j < str1.length();j++){
            char first = str1.charAt(j);

            for(int i =0; i < str2.length(); i++){
                char name = str2.charAt(i);

                if(first == name){
                    store.append(name);
                }

            }
            System.out.println(store);
        }
        System.out.println(store.reverse());
        if (str1.equals(store)){
            return true;
        }
        return false;
    }
}

public class Scrumblies{
    public static void main(String[]args){
        System.out.println(Main.scramble("rkqodlw","world"));
    }
}