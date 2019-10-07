package oca.arraylist;

public class ArrayDimensions {

    public static void main(String[] args) {
        int[][] myArray = new int[4][];
        myArray[0]= new int[2];
        myArray[0][0]= 1;
        myArray[0][1]= 2;
        myArray[1]= new int[7];
        myArray[1][0]= 3;
        myArray[1][1]= 4;
        myArray[1][2]= 5;
        myArray[2]= new int[1];
        myArray[2][0]= 6;
        myArray[3] = new int[]{7, 8, 9};// need to instantiate new object

        for(int i = 0; i < myArray.length; i++){
            for (int j = 0; j < myArray[i].length; j++){
                System.out.print(myArray[i][j]);
            }
            System.out.println();
        }
    }
}
