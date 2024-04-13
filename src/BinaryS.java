import java.util.Arrays;
import java.util.Scanner;

public class BinaryS {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int size = in.nextInt();
        int[] arr = { 76,26, 93, 108};
//        for (int i= 0; i<arr.length; i++){
//            arr[i] = in.nextInt();
//        }
//        int left =0;
//        int right =0;
//        int target = in.nextInt();
//        for(int i=0; i<arr.length; i++){
//            int mid = left + (right-left)/2;
//            if(mid > target){
//                right = mid-1;
//                mid = i;
//
//            }
//            else {
//                left = mid +1;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
        System.out.println(search(arr, 109));
    }
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<= end){
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid +1;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
