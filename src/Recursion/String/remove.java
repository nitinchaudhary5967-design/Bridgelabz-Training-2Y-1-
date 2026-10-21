package Recursion.String;

public class remove {
    public static String remove(String name,int index){
        if(index==name.length()){
            return "";
        }
        String small=remove(name,index+1);
        char ch=name.charAt(index);
        if(ch!='a'){
            return ch+small;
        }
        else{
            return small;
        }
    }
    static void main(String[] args){
        String str="abceade";
        System.out.println(remove(str,0));
    }
}
