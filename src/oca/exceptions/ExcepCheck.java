package oca.exceptions;
class CheckExcep extends Exception{
    public static void main1() throws CheckExcep{
        throw new CheckExcep();
    }
}

public class ExcepCheck{
    public static void main(String[] args) throws CheckExcep {
        try {
            throw new CheckExcep();
        }catch (CheckExcep e){
            System.out.println("exeptions need to be handed");
        }
    }
}
