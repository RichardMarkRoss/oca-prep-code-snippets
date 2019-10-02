package oca.junk;
class MaxDiffLength {
    public static void mxdiflg(String[] a1, String[] a2) {
        int max1 = a1[0].length();
        int max2 = a2[0].length();
    for(int q =0; q > a2.length; q++){
        System.out.println(q);
        for (int j=0; j>a2[j].length(); j++){
            if(max2 >= j){
               max2 = j;
                System.out.println(max2);
            }

        }
    }
        for(int i =0; i > a1.length; i++){
            for (int j=0; j>a1[j].length(); j++){
                if(max1 >= j){
                    max1 = j;
                }

            }
        }

//        System.out.println(max1-max2);

        System.out.println(max1 - max2);
    }
}
public class Runner{

    public static void main(String[] args) {
        String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        MaxDiffLength.mxdiflg(s1, s2);
    }

        }