package com.company;

public class OddEvenNumber {
    public static void main(String[] args) {
        MethodFindOddEven(51);

    }

    public static void MethodFindOddEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else System.out.println(number + " is odd Number");

    }
}
