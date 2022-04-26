package com.ritesh;

public class RitzArray1 {
    public static void main(String[] args) {
        int a[] = {0,1,2,4,9,6,8,13,25,42};

        for(int i=0;i<a.length;i++){
           if(a[i]%2==0){
               System.out.println(a[i]+" is even no" );
           }
           else
              System.out.println(a[i]+" is odd no");
        }

    }
}
