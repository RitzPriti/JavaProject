package com.ritesh;

public class BigNo {
    public static void main(String[] args) {
        BigNo R = new BigNo();
        R.findBiggestNo(-5,-4,-7);

    }
    public void findBiggestNo(int a, int b, int c){

        if (a>=b&&a>=c) {
            System.out.println("a is the biggest no");
        }
        else if (b>=a&&b>=c) {
            System.out.println("b is the biggest no");
        }
        else if (c>=a&&c>=b) {
            System.out.println("c is the biggest no");
        }
        }

    }

