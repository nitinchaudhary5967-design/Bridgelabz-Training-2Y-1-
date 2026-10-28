package Recursion.AdvanceRecursion;

public class TowerOfHanoi {
    public static void TOH(int n,char source,char helper,char destination){
        if(n==1){
            System.out.println("Move disk 1 from"+source+"to"+destination);
            return;
        }
        TOH(n-1,source,destination,helper);
        System.out.println("Move Disk"+n+"from"+source+"to"+destination);
        TOH(n-1,helper,source,destination);
    }
    public static void main(String[] args){
        int n=3;
        TOH(n,'A','B','C');
    }
}
