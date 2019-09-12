package oca.inheritance;

interface Printable{
    public default int getPageNumber(int input){ // default runs first
        return 2;
        }
}
public class Shape implements Printable{
    public String getPageNumber(){
        return "4";
    }
    public String getPageNumer(int input){ // if parent class was not default line would fail
        return "6";
    }
    public static void main(String[] args){
        System.out.println(new Shape().getPageNumber(-1));
    }
}