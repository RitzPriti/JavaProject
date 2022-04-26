package com.ritesh;

public class RitzArray2 {
    public static void main(String[] args) {
        int a[] = {1,2,7,13,5,6,7,8,9};
        int count = 0;
        int  primeYes=0;
        for (int i=0; i<a.length;i++){
            for(int x=2;x<a[i];x++){
                if(a[i]%x==0){
                    primeYes = 1;

                    break;
                }
                else primeYes = 0;
            }
            if(primeYes== 1){
                System.out.println(a[i]+ " is not prime number");
            }
            else System.out.println(a[i]+ " is prime number");

    }}}
