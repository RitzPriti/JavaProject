package com.company;

public class SwitchDayNumber {
    public static void main(String[] args) {
        DaySelection("Monday");
        DaySelection("Tuesday");
        DaySelection("Runday");
        DaySelection("Funday");



    }
    public static void DaySelection(String DayName){
        switch (DayName){
            case "Monday":
            {
                System.out.println(DayName + " day 1 of the week");
            }
            break;
            case "Tuesday":
            {
                System.out.println(DayName + " : day 2 of the week");
            }
            break;
            case "Wednesday":
            {
                System.out.println(DayName + " : day 3 of the week");
            }
            break;
            case "Thursday":
            {
                System.out.println(DayName + " : day 4 of the week");
            }
            break;
            case "Friday":
            {
                System.out.println(DayName + " : day 5 of the week");
            }
            break;
            case "Saturday":
            {
                System.out.println(DayName + " : day 6 of the week");
            }
            break;
            case "Sunday":
            {
                System.out.println(DayName + " : day 7 of the week");
            }
            break;
            default:
                System.out.println(DayName + " : Invalid Selection");

        }

    }
}
