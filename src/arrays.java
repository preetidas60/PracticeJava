import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] name = new int[7];
        for(int i=0;i<name.length;i++){
            name[i] = input.nextInt();
        }
        for(int num : name){
            System.out.print(num+" ");
        }
        System.out.println(Arrays.toString(name));
    }
}
