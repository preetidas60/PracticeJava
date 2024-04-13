import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("the element is in the index no."+linearSearch(arr,3));
    }
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
