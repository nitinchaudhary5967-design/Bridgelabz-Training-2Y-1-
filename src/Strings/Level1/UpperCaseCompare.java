package Strings.Level1;
import java.util.Scanner;
    public class UpperCaseCompare {
        public static String toUpperManual(String s) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    sb.append((char)(ch - 32));
                } else {
                    sb.append(ch);
                }
            }
            return sb.toString();
        }
        public static boolean compareStrings(String s1, String s2) {
            if (s1.length() != s2.length()) return false;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) return false;
            }
            return true;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter text: ");
            String str = sc.nextLine();
            String manualUpper = toUpperManual(str);
            String builtInUpper = str.toUpperCase();
            boolean result = compareStrings(manualUpper, builtInUpper);
            System.out.println("Manual Uppercase: " + manualUpper);
            System.out.println("Built-in Uppercase: " + builtInUpper);
            System.out.println("Results same? " + result);
        }
    }
