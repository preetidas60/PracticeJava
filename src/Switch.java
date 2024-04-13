import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Invalid");
//            case 1:
//                System.out.println("Sunday");
//                break;
//            case 2:
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("tuesday");
//                break;
//            case 4:
//                System.out.println("wednesday");
//                break;
//            case 5:
//                System.out.println("thursday");
//                break;
//            default:
//                System.out.println("invalid");
        }
    }
}
