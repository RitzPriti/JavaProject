package Lecture10;

public class MethodOverloadingExample {
    public static void main(String[] args) {
        abc();
        abc("this is java class");
        abc(5,7);

    }
    public static void abc(){
        System.out.println("Method without any parameter");
    }
    public static void abc(int a, int b){
        System.out.println("addition of variable a and b is : " + (a+b));
            }

            public static void abc(String str1){
                System.out.println(str1);
            }
}
