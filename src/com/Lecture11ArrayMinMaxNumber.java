package com;
import java.util.Arrays;
import java.util.Collections;
public class Lecture11ArrayMinMaxNumber {
    public static void main(String[] args) {
            Integer[] numbers = { 35,89,70,65,37};
            int min = (int) Collections.min(Arrays.asList(numbers));
            int max = (int) Collections.max(Arrays.asList(numbers));

            System.out.println("Min number: " + min);
            System.out.println("Max number: " + max);
        }
    }

