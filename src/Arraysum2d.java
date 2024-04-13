import java.util.Arrays;

public class Arraysum2d {
    public static void main(String[] args) {
        int[][] arr= { {1, 2,3}, {4,5,6} };
        int max =0;
        for (int[] ints : arr) {
            int sum = 0;
            for (int anInt : ints) {
                sum = sum + anInt;
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}