package Recursion.String;

public class reverseprint {
    public static void rev(String name,int index){
        if(index<0){
            return;
        }
        System.out.print(name.charAt(index));
        rev(name,index-1);
    }
    static void main(String[] args){
        String str="Krishna";
        rev(str,str.length()-1);
    }
}
