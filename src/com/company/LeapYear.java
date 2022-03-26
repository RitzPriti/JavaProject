package com.company;
// this class value find entered year is leap year or not
public class LeapYear {
    public static void main(String[] args) {
        int enter_year = 1900; // variable to enter year
         find_leapYear(enter_year); // called user defined method which is static to find the leap year
         int enter_year2 =2024; // another value for new year
         find_leapYear(enter_year2); // called Final leap year method to find our second variable is leap year or not


    }
    // find_leapYear is user defined static method

    public static void find_leapYear(int enter_year){
        int a=enter_year%400;
        int b=enter_year%100;
       int c=enter_year%4;
       if ((c==0)&&(b>0 || a==0)){

            System.out.println(enter_year + " is leap year");
        }
        else {
            System.out.println(enter_year + " is not leap year");
        }

    }
}
