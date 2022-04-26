package com.ritesh;

public class RitzFor2 {

    public static void main(String[] args) {
        factorial( 1);
        factorial(2);
        factorial(3);
        factorial(4);
        factorial(5);
    }
         public static void factorial(int a){
            int c = 1;
            for (int b = 1; b<=a;b++) {
                c = c * b;
            }
                System.out.println(c + " " + " is factorial of " + a);

    }
}
