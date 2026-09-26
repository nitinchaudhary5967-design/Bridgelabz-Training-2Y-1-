package Strings.Level3;
import java.util.Scanner;
    public class FrequencyUsingUniqueChars {
        public static char[] findUniqueCharacters(String text) {
            int len = text.length();
            char[] temp = new char[len];
            int uniqueCount = 0;
            for (int i = 0; i < len; i++) {
                char current = text.charAt(i);
                boolean isUnique = true;
                for (int j = 0; j < i; j++) {
                    if (text.charAt(j) == current) {
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique) {
                    temp[uniqueCount] = current;
                    uniqueCount++;
                }
            }
            char[] uniqueChars = new char[uniqueCount];
            for (int i = 0; i < uniqueCount; i++) {
                uniqueChars[i] = temp[i];
            }
            return uniqueChars;
        }

        public static String[][] findCharacterFrequency(String text) {
            int[] frequency = new int[256];
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                frequency[ch]++;
            }
            char[] uniqueChars = findUniqueCharacters(text);
            String[][] result = new String[uniqueChars.length][2];
            for (int i = 0; i < uniqueChars.length; i++) {
                char ch = uniqueChars[i];
                result[i][0] = String.valueOf(ch);
                result[i][1] = String.valueOf(frequency[ch]);
            }
            return result;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String text = sc.nextLine();
            String[][] frequencies = findCharacterFrequency(text);
            System.out.println("\nCharacter\tFrequency");
            System.out.println("-------------------------");
            for (int i = 0; i < frequencies.length; i++) {
                System.out.println("   '" + frequencies[i][0] + "'\t\t   " + frequencies[i][1]);
            }
        }
    }
