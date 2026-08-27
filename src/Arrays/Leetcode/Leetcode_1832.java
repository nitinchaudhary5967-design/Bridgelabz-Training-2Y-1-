package Arrays.Leetcode;
import java.util.*;
public class Leetcode_1832 {
    public static boolean checkIfPangram(int[] nums) {
        String sentence = new String();
        for(int i=0;i<nums.length;i++){
            sentence+= (char)(nums[i]);
        }
    boolean[] arr = new boolean[26];
       for(int i=0;i<sentence.length();i++){
        char ch = sentence.charAt(i);
        arr[ch- 'a']=true;
    }
       for(int i=0;i<26;i++){
        if(arr[i]==false){
            return false;
        }
    }
        return true;
}
static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    }
}
