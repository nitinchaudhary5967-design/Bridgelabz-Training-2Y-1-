package Strings.Level1;
import java.util.Scanner;
import java.util.Arrays;
    public class CharArrayCheck {
        public static char[] getChars(String s) {
            char[] arr = new char[s.length()];
            for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i);
            return arr;
        }
        public static boolean compareArrays(char[] a, char[] b) {
            if (a.length != b.length) return false;
            for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
            return true;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str = sc.next();
            char[] userArr = getChars(str);
            char[] builtInArr = str.toCharArray();
            boolean result = compareArrays(userArr, builtInArr);
            System.out.println("User-defined chars: " + Arrays.toString(userArr));
            System.out.println("Built-in chars: " + Arrays.toString(builtInArr));
            System.out.println("Arrays same? " + result);
        }
    }