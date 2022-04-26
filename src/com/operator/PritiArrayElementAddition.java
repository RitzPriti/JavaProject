package com.operator;

public class PritiArrayElementAddition {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 9, 10};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            //System.out.println(a[i]);
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}