package Arrays.Level1;
import java.util.Scanner;
public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (6 to 9): ");
        int num = sc.nextInt();
        int[] multiplicationResult = new int[10];
        if (num >= 6 && num <= 9) {
            for (int i = 1; i <= 10; i++) {
                multiplicationResult[i - 1] = num * i;
            }
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + multiplicationResult[i - 1]);
            }
        } else {
            System.out.println("Please enter a number between 6 and 9.");
        }
    }
}

