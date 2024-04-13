import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
//        ArrayList<Integer> list= new ArrayList<>(5);
//
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            list.add(input.nextInt());
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(list.get(i));
//        }
//        Collections.sort(list);
//        System.out.println(list);
        //        list.add(34);
//        list.add(45);
//        list.add(93);
//        list.add(475);
//        System.out.println(list);
//        System.out.println(list.indexOf(45));
//        System.out.println(list.get(2));
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i =0; i<3;i++){
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
