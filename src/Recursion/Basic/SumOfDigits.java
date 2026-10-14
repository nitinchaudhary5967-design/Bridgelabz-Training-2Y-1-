package Recursion.Basic;
public class SumOfDigits {
    public static int sum(int n) {
        if (n < 10) {
            return n;
        }
        int small=n%10;
        int small1=sum(n/10);
        return small1+small;
    }
    static void main(String[] args) {
        System.out.println(sum(12345));
    }
}
