package Lecture10;

public class FibonacciSeries {
    public static void main(String[] args) {
        fibonacciSeriesMethod(10);
    }

    public static void fibonacciSeriesMethod(int term){

        int a=1;
        int b=0;
        for(int i=0;i<=term;++i){
            System.out.println(b);
            int c=(a+b);
            a=b;
            b=c;
        }

    }
}
