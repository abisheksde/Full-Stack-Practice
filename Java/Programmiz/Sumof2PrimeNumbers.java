public class Sumof2PrimeNumbers {
    public static void main(String[] args) {
        int num = 100;

        //Logic
        //Check the Number is Prime or Not, one by one till num
        //if any one Number is Prime, then check num-i is Prime or Not
        //If both i & num-i are Prime. Print that
        
        for (int i = 2; i < num; i++) {

            if(checkPrime(i) && checkPrime(num-i)){
                System.out.printf("%d + %d =  %d \n", i, num-i, num);
            }
            
        }
    }

    static boolean checkPrime(int num){
        boolean isPrime = true;
        for (int i = 2; i < num; i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
