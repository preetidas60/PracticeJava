public class arrayfun {
    public static void main(String[] args) {
        int[] arr = {23,45,65,75};
        changearr(arr);
        for(int i:arr) {
            System.out.println(i);
        }
    }

    public static void changearr(int[] arr){
        arr[0]= 99;
    }

}


