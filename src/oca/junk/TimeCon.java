package oca.junk;

import javax.tools.JavaCompiler;
import java.time.LocalDate;// using local date need to call time package
import java.time.Month;// month is a enum packege to return the value of the month for date package
import java.time.Year;
public class TimeCon {
        public static void main(String [] args) {
            LocalDate date = LocalDate.of(2068, 4, 15);// instatiating new value cancels out values
            date = LocalDate.of(2019, Month.DECEMBER,13);// call enum or values for 1 to 10...
            System.out.println(date.getMonth() + ":" + date.getMonthValue());// getMonth gets interger value and getMonthValue gets the interger value
        }
}
