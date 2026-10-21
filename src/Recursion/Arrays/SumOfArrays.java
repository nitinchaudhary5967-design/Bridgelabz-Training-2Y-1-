package Recursion.Arrays;

public class SumOfArrays {
    public static int sum(int arr[],int index){
        if(index==arr.length){
            return 0;
        }
        int add= sum(arr,index+1);
        return add+arr[index];
    }

    static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println(sum(arr,0));
    }
}
