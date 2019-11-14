package playingWithStrings;

import java.util.ArrayList;
import java.util.List;
class name{

}
public class Solution {
    public static String lcs(String x, String y) {
        char[] xVal = x.toCharArray();
        char[] yVal = y.toCharArray();
        List<Character> store = new ArrayList<>();
        System.out.println(store.toString());
        if(xVal.length >= yVal.length){
            for(int i=0; i<yVal.length;i++){
                for(int j=0; j<xVal.length;j++){
                    if(yVal[i] == xVal[j]){
                        store.add(xVal[j]);
                        break;
                    }
                }
            }
            return store.toString();
        }else if (xVal.length > yVal.length){
            for(int i=0; i<xVal.length;i++){
                    for(int j=0; j<yVal.length;j++){
                        if(xVal[i] == yVal[j]){
                            store.add(yVal[j]);
                            break;
                        }
                    }
                }
                return store.toString();
        }else{
            return store.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(lcs("a", "b"));
        System.out.println(lcs("abcdef", "abc"));
        System.out.println(lcs("abcdsa", "acna"));
        System.out.println(lcs("abcf", "acnsfd"));
    }
}