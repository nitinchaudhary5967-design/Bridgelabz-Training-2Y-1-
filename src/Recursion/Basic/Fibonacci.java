package Recursion.Basic;
public class Fibonacci {
    public static int fib(int n){
        //base case
        if(n==0||n==1){
            return n;
        }
        int small1=fib(n-1);
        int small2=fib(n-2);
        return small1+small2;
    }

    static void main(String[] args) {
       int result=fib(5 );
        System.out.println(result);
    }
}
