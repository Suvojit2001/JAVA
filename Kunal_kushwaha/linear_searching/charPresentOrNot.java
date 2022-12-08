package Kunal_kushwaha.linear_searching;

public class charPresentOrNot {
    static boolean search (String name,char target){
    name = name.toLowerCase();
    if (name.length()==0){
        return  false;
    }
    for (int i =0;i<name.length();i++){
        if (target == name.charAt(i)){
            return  true;
        }
    }
    return false;
    }

    static boolean search2 (String name,char target){
        name = name.toLowerCase();
        if (name.length()==0){
            return  false;
        }
        for (char ch : name.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
//Q1) Check if a char present in a given string or not
        System.out.println(search("Suvojit",'u'));
        System.out.println(search2("Harry",'h'));
    }
}
