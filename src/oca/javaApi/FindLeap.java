package oca.javaApi;

import java.time.LocalDate;

public class FindLeap {

    public static void main(String[] args) {
    LocalDate localDate = LocalDate.of(2020, 1, 31);
    boolean isLeapYear = localDate.lengthOfYear() > 365;
        System.out.println(isLeapYear);
    }
}