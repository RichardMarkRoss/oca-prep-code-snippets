package oca.for_loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Numtum {
    public String[] dirReduc(String[] arr) {
        List<String> array = new ArrayList(Arrays.asList(arr));
        for(int i = 0; i < array.size(); i++){
            if(arr[i].equals("NORTH")){
                int k = i;
                if(arr[k + 1].equals("SOUTH")){
                    array.remove(i);
                    array.remove(k);
                }
            }
            else if(arr[i].equals("SOUTH")){
                int k = i;
                if(arr[k+1].equals("NORTH")){
                    array.remove(i);
                    array.remove(k);
                }
            }
            else if(arr[i].equals("WEST")){
                int k = i;
                if(arr[i+1].equals("EAST")){
                    array.remove(i);
                    array.remove(k); }
            }
            else if(arr[i].equals("EAST")){
                int k = i;
                if(arr[i+1].equals("WEST")){
                    array.remove(i);
                    array.remove(k);
                }
            }

        }
        return array.toArray(new String[0]);
    }
}
public class DirReduction{
    public static void main(String[] args) {
        Numtum dir = new Numtum();
        String[] directions = new String[]{"NORTH", "SOUTH", "EAST", "EAST", "WEST"};
        dir.dirReduc(directions);
    }

}