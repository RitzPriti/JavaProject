package com.company;

public class AgeLimit {


    public static void main(String[] args) {
        FindAgeLimit(19);
        FindAgeLimit(33);
        FindAgeLimit(56);
        FindAgeLimit(79);

         }

    public static void FindAgeLimit(int enterAge) {
        if (enterAge <= 20) {
            System.out.println("entered Age :" + enterAge + " Child");
        } else if (enterAge >= 20 && enterAge <= 50) {
            System.out.println("entered Age :" + enterAge + " healthy man");
        } else if (enterAge >= 51 && enterAge <= 75) {
            System.out.println("entered Age :" + enterAge + " Retired Man");
        }
        else System.out.println("entered Age :" + enterAge + " senior citizen");
    }
}
