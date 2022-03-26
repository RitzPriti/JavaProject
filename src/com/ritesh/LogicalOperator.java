package com.ritesh;

public class LogicalOperator {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        System.out.println(a>6 || b<5);
        System.out.println(a<5 && b>5);
        System.out.println(!(a<5 && b>5));
        System.out.println((a==b));
        System.out.println(a<b);
        System.out.println(a!=b);
        System.out.println(++a);
        System.out.println(--a);
        System.out.println(--a);

    }
}
