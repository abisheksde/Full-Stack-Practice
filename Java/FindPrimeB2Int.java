public class FindPrimeB2Int {
    public static void main(String[] args) {
        System.out.println(15%3);

        printPrime();
        

    }

    public static void printPrime(){
        int num1 = 15;
        int num2 = 25;

        boolean isPrime;

        while (num1<=num2) { 
            isPrime = true;
            for (int i = 2; i < num1; i++) {
                if(num1%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("Prime is : "+ num1);
            }
            num1++;
        }

        
    }
}
