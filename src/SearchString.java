import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        String name = "evjxpnqgmvfjl";
        char target = 't';
        char value = 'a';
        for(int i=0; i<name.length()-1; i++){
            for(int j=i+1; j<name.length(); j++){
                if(name.charAt(i) == name.charAt(j)){
                    value = name.charAt(i);
                    System.out.println(value);
                }
            }
        }

        System.out.println(searchstring(name,target));
    }
    static int searchstring(String str, int target){
//        for (int i = 0; i < str.length(); i++) {
//            if(target == str.charAt(i)){
//                return i;
//            }
//        }
        for(char ch : str.toCharArray()){
            if(ch == target){
                return ch;
            }
        }
        return -1;
    }
}
