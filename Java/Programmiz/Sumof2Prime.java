public class Sumof2Prime {
    public static void main(String[] args) {
        
        int num = 100;
        int originalNumber = num;

        for (int i = 2; i < num; i++) {
            if(checkPrime(i)){
                if(checkPrime(num-i)){
                    System.out.printf("%d + %d = %d \n", i, num-i, num);
                }
            }
        }


        
            
    }

    public static boolean checkPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                isPrime = false;
                return isPrime;
            }
        }
        return isPrime;
    }
}

//Shuffle Deck of Card
