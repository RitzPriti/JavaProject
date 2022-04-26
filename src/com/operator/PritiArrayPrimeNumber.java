package com.operator;

public class PritiArrayPrimeNumber {
       public static void main(String[] args) {
            int a[] = {19,8,7,13,5,6,7,8,9};
            int count = 0;
            int  primeYes=0;

            for (int i=0; i<a.length;i++){
                if (a[i]==1||a[i]==0){
                    primeYes =1;}
                else {
                for(int x=2;x<a[i];x++){
                    if(a[i]==2){
                        primeYes = 0;
                        break;
                        }
                   else {if(a[i]%x==0){
                        primeYes = 1;

                        break;
                    }
                    else primeYes = 0;}
                }}
                if(primeYes== 1){
                    System.out.println(a[i]+ " is not prime number");
                }
                else System.out.println(a[i]+ " is prime number");

            }}}

