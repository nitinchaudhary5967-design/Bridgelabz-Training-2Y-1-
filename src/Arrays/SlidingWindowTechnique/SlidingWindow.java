package Arrays.SlidingWindowTechnique;
import java.util.*;
public class SlidingWindow {
     static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int[] arr=new int[n];
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
         int size=sc.nextInt();
         int sum=0;
         for (int i=0;i<size;i++){
             sum=sum+arr[i];
         }
         System.out.println("This is the sum of first window:- "+sum);
         for(int i=1;i<=arr.length-size;i++){
             sum=sum-arr[i-1]+arr[i+size-1];
             System.out.println(sum);
         }
     }
}
