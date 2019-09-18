package oca.junk;

class Mains {

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        int oldPrice = startPriceOld;
        int newPrice = startPriceNew;
        int counter = 0;
        int savings =0;
        double percentLoss = percentLossByMonth;
        while(oldPrice < newPrice){
            counter++;
            if((percentLoss % counter) == 0) {
                percentLoss = Double.sum(percentLoss, 0.5);
            }
            System.out.println(percentLoss);
            oldPrice -= (int) (( percentLoss * oldPrice ) / 100);
            newPrice -= (int) (( percentLoss * newPrice ) / 100);
            if (((savingperMonth*counter)+oldPrice) >= newPrice){
                savings = startPriceNew - newPrice;
                System.out.println(savings);
                return new int[]{counter, savings};
            }
        }
        return new int[]{counter, savings};
    }
}

public class BuyCar{
    public static void main(String[] args) {
        Mains.nbMonths(2000,8000,1000,1.5);
    }
}