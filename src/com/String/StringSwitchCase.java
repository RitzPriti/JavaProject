package com.String;

public class StringSwitchCase {
    public static void main(String[] args) {
        StringSwitchCase myName = new StringSwitchCase();
        myName.MyName1("Priti",0);
        myName.MyName1("Manav", 5);
        myName.MyName1("Master", 9);

    }
    public void MyName1(String myName, int b){
        StringSwitchCase R= new StringSwitchCase();


        int c=myName.length();
        if(c<=5) {
            switch (b) {
                case 0:
                    System.out.println("Entered place value of "+ b + "is : " +myName.charAt(0));
                    break;
                case 1:
                    System.out.println(myName.charAt(1));
                    break;
                case 2:
                    System.out.println(myName.charAt(2));
                    break;
                case 3:
                    System.out.println(myName.charAt(3));
                    break;
                case 4:
                    System.out.println(myName.charAt(4));
                    break;
                default:
                    System.out.println("Invalid selection");
            }
        } else System.out.println("Please enter string with less than 6 character");
        }
    }

