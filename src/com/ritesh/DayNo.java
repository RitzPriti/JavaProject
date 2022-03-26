package com.ritesh;

public class DayNo {
        public static void main(String[] args) {
            DayNo R = new DayNo();
            R.EntreDayNo("Sunday"); R.EntreDayNo("Monday"); R.EntreDayNo("Tuesday");
            R.EntreDayNo("Wednesday");R.EntreDayNo("Thursday"); R.EntreDayNo("Friday");
            R.EntreDayNo("Saturday"); R.EntreDayNo("January");
        }
        public void EntreDayNo(String a) {
            switch (a) {
                case "Sunday":
                    System.out.println(a+" "+"Weekday is corresponding to number : 0");
                    break;
                case "Monday":
                    System.out.println(a+" "+"Weekday is corresponding to number : 1");
                    break;
                case "Tuesday":
                    System.out.println(a+" "+"Weekday is corresponding to number : 2");
                    break;
                case "Wednesday":
                    System.out.println("3");
                    break;
                case "Thursday":
                    System.out.println("4");
                    break;
                case "Friday":
                    System.out.println("5");
                    break;
                case "Saturday":
                    System.out.println("6");
                    break;
                default:
                    System.out.println("Invalid Weekday Name");

            }
        }
}
