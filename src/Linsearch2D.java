import java.util.Arrays;

public class Linsearch2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        System.out.println(search(arr));

    }
    static int search(int[][] arr){
        int target = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > target){
                    target = arr[row][col];
                }
            }
        }
        return target;
    }
}
