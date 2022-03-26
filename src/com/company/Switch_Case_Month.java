package com.company;

public class Switch_Case_Month {
    public static void main(String[] args) {
        Switch_Case_Month R = new Switch_Case_Month();
        R.MonthNumber(1);
        R.MonthNumber(2);
        R.MonthNumber(13);

    }
    public void MonthNumber(int a){
        switch (a){
            case 1: {
                System.out.println(a + "  :  Enter number is for January");
            }
            break;
            case 2:
            { System.out.println(a + "  :  Enter number is for February");
            }
            break;
            case 3:
            { System.out.println(a + "  :  Enter number is for March");
            }
            break;
            case 4:{
                System.out.println(a + "  :  Enter number is for March");
            break;}
            default : System.out.println(a + "  :  Enter number is Invalid Selection");
        }



    }
}
