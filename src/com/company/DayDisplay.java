package com.company;

public class DayDisplay {
    public static void main(String[] args) {
        DayDisplay N =new DayDisplay();
        N.Display1(1);
        N.Display1(2);
        N.Display1(11);

    }
    public void Display1(int number){
        switch(number){
            case 1:
                System.out.println(number + " : spells ONE");
                break;
            case 2:
                System.out.println(number + " : spells TWO");
                break;
            case 3:
                System.out.println(number + " : spells Three");
                break;
            case 4:
                System.out.println(number + " : spells Four");
                break;
            default:
                System.out.println("Invalid selection of number");


        }
    }
}
