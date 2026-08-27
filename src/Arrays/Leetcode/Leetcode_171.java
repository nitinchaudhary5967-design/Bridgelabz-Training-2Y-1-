package Arrays.Leetcode;
import java.util.*;
public class Leetcode_171 {
    class Solution {
        public int titleToNumber(String col) {
            int sum=0;
            int p=0;
            int n=col.length();
            for(int i=n-1;i>=0;i--){
                int temp=col.charAt(i)-64;
                sum=sum+(int)Math.pow(26,p++)*temp;
            }

            return sum;
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String col = sc.nextLine();
            Leetcode_171 obj = new Leetcode_171();
            Solution sol = obj.new Solution();
            System.out.println(sol.titleToNumber(col));
        }
    }

