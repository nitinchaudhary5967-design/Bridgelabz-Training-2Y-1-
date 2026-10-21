package Recursion.Basic;

public class HCF {
    public static int hcf(int x,int y){
        if(y==0){
            return x;
        }
            return hcf(x,x%y);
    }

    static void main(String[] args) {

    }
}
