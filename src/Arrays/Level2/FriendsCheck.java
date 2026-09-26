package Arrays.Level2;
import java.util.Scanner;
    public class FriendsCheck {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] names = {"Amar","Akbar","Anthony"};
            int[] age = new int[3];
            int[] ht = new int[3];

            for (int i = 0; i < 3; i++) {
                System.out.print(names[i] + " age: ");
                age[i] = sc.nextInt();
                System.out.print(names[i] + " height: ");
                ht[i] = sc.nextInt();
            }

            int minAgeIdx = 0, maxHtIdx = 0;
            for (int i = 1; i < 3; i++) {
                if (age[i] < age[minAgeIdx]) minAgeIdx = i;
                if (ht[i] > ht[maxHtIdx]) maxHtIdx = i;
            }

            System.out.println("Youngest: " + names[minAgeIdx]);
            System.out.println("Tallest: " + names[maxHtIdx]);
        }
    }

