import java.util.Arrays;

public class Samefun {
    public static void main(String[] args) {
//        name(768);
//        name("Preeti");
//    }
//    static void name(int a){
//        System.out.println(a);
//    }
//    static void name(String a){
//        System.out.println(a);
//    }
    int[] arr = {34, 67, 87, 76};
        System.out.println(Arrays.toString(arr));
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] nums, int num1, int num2){
        int temp = nums[num1];
        nums[num1]= nums[num2];
        nums[num2] = temp;
    }
}
