package Recursion.String;

public class print {
    public static void print(String name,int index){
        if(index==name.length()){
            return;
        }
        System.out.println(name.charAt(index));
        print(name,index+1);
    }

    static void main(String[] args) {
        String str="NITIN";
        print(str,0);
    }
}
