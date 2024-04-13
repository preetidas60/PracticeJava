import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
//        int[] nums = {2,7,-25,-4};
//        int min = nums[0];
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]<min){
//                min = nums[i];
//            }
//        }
//        System.out.println(min);
        int[] nums = {1,2,3,4,5};
        System.out.println(sum(nums));
    }
    static int sum(int[] arr){
        int value =0;
        for(int i=0; i<(arr.length); i++){
             value = value + arr[i];
        }
        return value;
    }
}
