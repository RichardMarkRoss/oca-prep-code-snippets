package oca;

class DigPow {

    public static long digPow(int n, int p) {
        int j = p;
        int total=0;
        int [] array = Integer.toString(n).chars().map(c -> c-'0').toArray();
        for(int i = 0; i < array.length; i++){
            total += Math.pow(array[i],p++);
            System.out.println(total);
        }
        if(total % n == 0){
            return 1;
        }else if(total % n != 0){
            total = (total/n);
            return total;
        }
        return -1;
//             return total;
    }
}

public class PowerFinder {
    public static void main(String[] args) {
        DigPow.digPow(46288 , 3);
    }
}
