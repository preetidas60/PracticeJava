import java.util.Arrays;

public class Var_arg {
    public static void main(String[] args) {
        arr(3,5,6,7,8,5,6,7,8);
        fun(4,6,7,7,6,55,45,2);
    }
    static void arr(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int a, int b, int ...v){

    }
}
