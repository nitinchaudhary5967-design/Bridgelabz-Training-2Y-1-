package Recursion.Basic;

public class PrintNumbers {
    public static void printInc(int n){
        //Base case
       if(n==10){
            System.out.print(n+" ");
            return;
        }
        //Recursive work
        printInc(n+1);
        //Self work
        System.out.print(n+" ");
    }

    static void main(String[] args) {
        printInc(1);
    }
}
