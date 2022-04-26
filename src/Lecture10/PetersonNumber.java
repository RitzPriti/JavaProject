package Lecture10;

public class PetersonNumber {
    public static void main(String[] args) {
        //PetersonNumber objPeterson = PetersonNumber();
     //   int k = factorial(7);
       // System.out.println(k);
        findPetersonNumber(145);
        findPetersonNumber(55);
        findPetersonNumber(2);
        findPetersonNumber(40);


    }
    public static void findPetersonNumber(int inputNumber){
       int  a=inputNumber;
        int sum1 = 0;
        while(a>0) {
            int b = a % 10;
            int factorial = factorial(b);
            sum1 = sum1 + factorial;
            a=a/10;

        }
        if(inputNumber == sum1) {
            System.out.println(inputNumber+ " is peterson Number");}
        else System.out.println(inputNumber+ " is not peterson Number");

    }
    public static int factorial(int number)
    {
    int fact1=1;
        for(int i= 1;i<=number;i++) {
            fact1 =  fact1 * i;
        }
     return fact1;
    }
}
