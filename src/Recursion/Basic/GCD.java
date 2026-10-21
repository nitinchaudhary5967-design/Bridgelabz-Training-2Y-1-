package Recursion.Basic;

import java.util.Scanner;

public class GCD {
    //base case
    public static int gcd(int x,int y ){
        if(y==0){
            return x;
        }
        return gcd(x,x%y);
    }
        static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number");
        int b=sc.nextInt();
        System.out.println("Enter second number");
        int a=sc.nextInt();
        System.out.println(gcd(b,a));
    }
}
