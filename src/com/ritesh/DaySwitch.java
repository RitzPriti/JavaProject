package com.ritesh;

public class DaySwitch {
    public static void main(String[] args) {
        DaySwitch R = new DaySwitch();
        R.EnterDay(1);
        R.EnterDay(2);
        R.EnterDay(3);
        R.EnterDay(4);
        R.EnterDay(5);
        R.EnterDay(6);
        R.EnterDay(7);
        R.EnterDay(8);
    }
    public void EnterDay(int a) {

        switch (a) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Number");

        }
    }}