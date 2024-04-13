import java.util.Arrays;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int count=0;
//        int rev=0;
//        while(n>0){
//            int rem = n%10;
//            n= n/10;
//            rev = rev *10+rem ;
//            }
//        System.out.println(rev);
//
// }
//        int[] array = {1,2,3,4,5};
//        for(int i : array){
//            System.out.println(i);
//        }
        //Arrays.toString() Function
//        int[] arr = {5,10,15,20};
//        System.out.println(Arrays.toString(arr));
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = input.nextInt();
            }
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

        }
        }
