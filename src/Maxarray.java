import java.util.Scanner;

public class Maxarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
        int max =0;
        for (int i = 0; i < 5; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
