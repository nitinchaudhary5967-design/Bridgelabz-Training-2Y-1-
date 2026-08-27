package Arrays.Logical_Building;
import java.util.Scanner;
public class FirstOccuringRepeating{

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int firstoccuringelement(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {        //not void so return
                if (arr[i] == arr[j]) {
                    return (arr[i]);     //System.out.println();
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=firstoccuringelement(arr);
        System.out.println(ans);
    }
}