package com.ritesh;

public class Method2 {
    public static void main(String[] args) {

        Method2 R  = new Method2();
        R.add1();
        printName("Ritesh","Patel");
    }

    public void add1() {
        int a = 20;
        int b = 10;
        int c = a + b;

        System.out.println(c);

    }
    public static void printName(String firstname, String lastname){
        System.out.println(firstname+" "+lastname);
    }


}

