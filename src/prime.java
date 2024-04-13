import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        int c=2;
//        while (c*c <=n){
//            if (n % c == 0) {
//                System.out.println("not prime");
//            }
//            c++;
//        }
//        System.out.println(c);
//        if(c*c>n){
//            System.out.println("prime");
//        }
        int count =0;
        for (int i=2;i*i<=n;i++){
            if(n%i ==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}
