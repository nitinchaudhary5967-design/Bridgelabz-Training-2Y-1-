package Strings.Level2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
    public class WordLengthCheck {
        public static String[] getWords(String text) {
            List<String> words = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (ch == ' ') {
                    if (sb.length() > 0) {
                        words.add(sb.toString());
                        sb.setLength(0);
                    }
                } else {
                    sb.append(ch);
                }
            }
            if (sb.length() > 0) words.add(sb.toString());

            return words.toArray(new String[0]);
        }
        public static int getLength(String s) {
            int count = 0;
            try {
                while (true) {
                    s.charAt(count);
                    count++;
                }
            } catch (Exception e) {
                return count;
            }
        }
        public static String[][] wordLengths(String[] words) {
            String[][] result = new String[words.length][2];
            for (int i = 0; i < words.length; i++) {
                result[i][0] = words[i];
                result[i][1] = String.valueOf(getLength(words[i]));
            }
            return result;
        }
        public static String[] findShortestLongest(String[][] data) {
            String shortest = data[0][0], longest = data[0][0];
            int minLen = Integer.parseInt(data[0][1]);
            int maxLen = minLen;
            for (int i = 1; i < data.length; i++) {
                int len = Integer.parseInt(data[i][1]);
                if (len < minLen) {
                    minLen = len;
                    shortest = data[i][0];
                }
                if (len > maxLen) {
                    maxLen = len;
                    longest = data[i][0];
                }
            }
            return new String[]{shortest, longest};
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter text: ");
            String text = sc.nextLine();
            String[] words = getWords(text);
            String[][] data = wordLengths(words);
            String[] result = findShortestLongest(data);
            System.out.println("Shortest word: " + result[0]);
            System.out.println("Longest word: " + result[1]);
        }
    }

