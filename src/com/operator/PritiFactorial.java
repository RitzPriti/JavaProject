package com.operator;

public class PritiFactorial {
   public static void main(String[] args) {
       methodFactorial(5);
       methodFactorial(2);
   }
   public static void methodFactorial(int a) {
       int c=1;
       for(int b = 1; b <= a; b++) {
        c = c * b; // System.out.println(c);
       }
       System.out.println("factorial of " + a + " is : " + c);
   }
}
