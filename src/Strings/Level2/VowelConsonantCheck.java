package Strings.Level2;
import java.util.Scanner;
    public class VowelConsonantCheck {
        public static String checkCharType(char ch) {
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            if (ch >= 'a' && ch <= 'z') {
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    return "Vowel";
                else
                    return "Consonant";
            } else {
                return "Not a Letter";
            }
        }
        public static String[][] analyzeString(String str) {
            String[][] result = new String[str.length()][2];
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                result[i][0] = String.valueOf(ch);
                result[i][1] = checkCharType(ch);
            }
            return result;
        }
        public static void display(String[][] data) {
            System.out.println("Char\tType");
            for (String[] row : data) {
                System.out.println(row[0] + "\t" + row[1]);
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            String[][] result = analyzeString(str);
            display(result);
        }
    }

