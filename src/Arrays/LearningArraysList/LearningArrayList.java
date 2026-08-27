package Arrays.LearningArraysList;
 import java.util.ArrayList;
 import java.util.Arrays;
public class LearningArrayList {
    static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,2);
        list.add(1,4);
        list.add(2,9);
        list.add(3,12);
        list.add(4,15);
        list.add(0,5);
        System.out.println("This is our ArrayList : ");
        System.out.println(list);
        int result[] = new int[6];
        for(int i=0;i<result.length;i++) {
            result[i] = list.get(i);
        }
            System.out.print("we have converted arraylist into array : ");
        System.out.println(Arrays.toString(result));

    }

}
