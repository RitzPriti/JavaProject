package com.operator;

public class PritiArrayOddEven {
    public static void main(String[] args) {
        int a[] = {0, 11, 2, 4};

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i] + " is even no");
            } else
                System.out.println(a[i] + " is odd no");
        }

    }
}
