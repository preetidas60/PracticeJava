public class primelist {
    public static void main(String[] args) {
        System.out.println(isPrime(91));
        for(int i=2; i<100;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int n){
        int count=0;
        for(int i=2;i*i<=n;i++){
            if (n % i == 0) {
                count++;
            }
        }
        return count==0;
    }
}
