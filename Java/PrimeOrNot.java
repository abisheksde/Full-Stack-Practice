public class PrimeOrNot {
    public static void main(String[] args) {
        int num = 99;
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        
        if(isPrime){
            System.out.println("The Number is Prime");
        } else {
            System.err.println("Number is Not Prime");
        }
    }
}
