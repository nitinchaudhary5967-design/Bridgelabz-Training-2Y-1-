package Strings.Level1;
import java.util.Scanner;
    public class ArrayExceptionDemo {
        public static void generateException(String[] arr) {
            System.out.println("Accessing invalid index...");
            System.out.println(arr[5]);
        }
        public static void handleException(String[] arr) {
            try {
                System.out.println("Accessing invalid index with handling...");
                System.out.println(arr[5]); // invalid access
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
            } catch (RuntimeException e) {
                System.out.println("Caught RuntimeException: " + e);
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] names = new String[3];
            for (int i = 0; i < names.length; i++) {
                System.out.print("Enter name " + (i+1) + ": ");
                names[i] = sc.next();
            }
            handleException(names);
        }
    }

