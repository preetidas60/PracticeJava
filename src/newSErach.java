import java.util.Arrays;

public class newSErach {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        int target = 5;
        int[] index = search(arr, target);
        System.out.println(Arrays.toString(index));
    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }
}

