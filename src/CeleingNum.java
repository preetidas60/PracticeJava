public class CeleingNum {
    public static void main(String[] args) {
        int[] arr ={1, 4, 6, 8, 9,14 ,17, 28, 34, 38, 45};
        System.out.println(cele(arr, 34));
    }
    static int cele(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int result = 0;
        while(start<=end){
            int mid = start +(end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target <= arr[mid]){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return end +1;
    }
}
