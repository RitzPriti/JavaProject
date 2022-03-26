package com.ritesh;

public class BirthMonth {
    public static void main(String[] args) {
        BirthMonth R = new BirthMonth();

        R.EntreBirthMonth("January");
        R.EntreBirthMonth("February");
        R.EntreBirthMonth("July");
        R.EntreBirthMonth("December");

            }
            public void EntreBirthMonth(String a){
        switch(a) {
            case "January":
                System.out.println("Priti's B'Day");
                break;
            case "March":
                System.out.println("Ritz & Manav's B'Day");
                break;
            case "July":
                System.out.println("Udi's B'Day");
                break;
            default:
                System.out.println("Its No one's B'Day this month");

        }

            }
}
