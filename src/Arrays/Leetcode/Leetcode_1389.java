package Arrays.Leetcode;
import java.util.*;
public class Leetcode_1389 {
    public static int [] createTargetArray(int[] nums, int[] index) {
    ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
        list.add(index[i],nums[i]);
    }
    int[] target = new int[nums.length];
        for(int i=0;i<target.length;i++){
        target[i]=list.get(i);
    }
    return target;
}
}
