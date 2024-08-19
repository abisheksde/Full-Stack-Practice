public class SumOfFirstNFibonacci {
    public static void main(String[] args) {
        int n = 13;

        
        System.out.println(fib(n));
    }

    static int fib(int n){
        if(n<=1){
            return n;
        }

        int l = fib(n-1);
        int r = fib(n-2);      
        return l + r;
    }
}
