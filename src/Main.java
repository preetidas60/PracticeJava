import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max =a;
        if(b>max){
            max = b;
        }
        if(c> max){
            max = c;
        }
        System.out.println(max);
        int f = 50;
        {
            f = 56;
            int g = 23;
        }
        System.out.println(f);
    }
}