package oca.for_loops;

public class AboutLoopBreaks {

    public static void main(String[] args) {

        for (int i = 0; i < 100 ; i++) {
            for (int j = 0; j < 100; j++) {
                if(j == 10){
                    break;
                }
            }
        }
    }
}
