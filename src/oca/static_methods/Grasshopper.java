package oca.static_methods;
class GrassHopper {

    public static char getGrade(int s1, int s2, int s3) {
        int[] num = new int[]{s1, s2, s3};
        int sum = 0;
        for(int i=0; i < num.length; i++){
            sum += num[i];
        }
        int x = sum/num.length;

        if (0 <= x && x < 60){
            return 'F';
        }else if(60 <= x && x < 70){
            return 'D';
        }else if(70<= x && x < 80){
            return 'C';
        }else if(80 <= x && x < 90){
            return 'B';
        }else if(90<= x && x < 100){
            return 'A';
        }
        return 0;
    }

}