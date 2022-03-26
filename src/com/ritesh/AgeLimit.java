package com.ritesh;

public class AgeLimit {
    public static void main(String[] args) {
        int age=60;
        if(age<=20){
            System.out.println("Child");}
       else if(age>=21&&age<=50){
            System.out.println("Healthy Man");}
       else if (age>=51&&age<=75){
            System.out.println("Retired Man");}
        else
        System.out.println("senior citizen");
    }

    }


