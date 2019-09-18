package oca.junk;

class Mains {

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        int oldPrice = startPriceOld;
        int newPrice = startPriceNew;
        double percentage = percentLossByMonth;
        int counter = 0;
        int savings =0;
        while(oldPrice < newPrice){
            counter++;
            if((counter % 2) == 0){
                percentage = Double.sum(percentage, 0.5);
            }
            oldPrice -= (int) (( percentage * oldPrice ) / 100);
            newPrice -= (int) (( percentage * newPrice ) / 100);
            if (((savingperMonth*counter)+oldPrice) >= newPrice){
                savings = ((savingperMonth*counter)+oldPrice) % newPrice;
                return new int[]{counter, savings};
            }
        }
        int largerAmount = startPriceOld-startPriceNew;
        return new int[]{counter, largerAmount};
    }
}

public class BuyCar{
    public static void main(String[] args) {
        Mains.nbMonths(12000, 8000, 1000, 1.5);
    }
}