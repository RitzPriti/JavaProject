package com.String;

public class String2 {
    public static void main(String[] args) {

        String myName = "Priti";
        String lastName = "kamle";

        System.out.println(myName.charAt(2));
        System.out.println(myName.indexOf('P'));

        System.out.println(myName+" "+lastName);

        System.out.println(myName.concat(lastName));

        System.out.println(myName.length());

        int length =myName.length();

        System.out.println(length);
        System.out.println(myName.toLowerCase());
        System.out.println(lastName.toUpperCase());

    }
}
