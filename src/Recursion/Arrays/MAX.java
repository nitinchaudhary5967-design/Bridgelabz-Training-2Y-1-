package Recursion.Arrays;

import java.util.Scanner;

public class MAX {
    public static int max(int arr[],int n){
        //base case
        if(n==0){
            return arr[0];
        }
        return Math.max(arr[n-1],max(arr,n-1));
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();

    }
}
