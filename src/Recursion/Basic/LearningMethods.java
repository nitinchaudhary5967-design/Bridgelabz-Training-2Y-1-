package Recursion.Basic;

public class LearningMethods {
    public static int substract(int a,int b){
        return a-b;
    }
    public static void mul(int a,int b){
        System.out.println(a*b);
    }
    public static void div(int a,int b){
        System.out.println(b/a);
    }
    static void main(String[] args){
        System.out.println(substract(30,20));
        int result=substract(30,20);
        System.out.println(result);
        mul(10,20);
        div(10,20);
    }
}
