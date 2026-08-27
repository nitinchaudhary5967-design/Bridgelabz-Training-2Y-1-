package Arrays.Leetcode;
import java.util.*;
public class Leetcode_1528 {
    class Solution {
        public String restoreString(String s, int[] indices) {
            char result[] = new char[s.length()];
            for (int i = 0; i < s.length(); i++) {
                result[indices[i]] = s.charAt(i);
            }
            return new String(result);
        }
    }
        static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            int n = s.length();
            int[] indices = new int[n];
            for(int i=0;i<n;i++){
                indices[i]=sc.nextInt();
            }
            Leetcode_1528 obj = new Leetcode_1528();
            Solution sol = obj.new Solution();
            System.out.println(sol.restoreString(s,indices));
        }
    }

