package com.ritesh;

public class LeapYear {
    public static void main(String[] args) {
        LeapYear R = new LeapYear();
 R.findLeapYear(2000);
    }

            public void findLeapYear(int a){
            if(a%4==0&&(a%100>0||a%400==0)){
                System.out.println(a+" "+"is Leap Year");
            }
            else System.out.println(a+" "+"is not Leap Year");
        }}




