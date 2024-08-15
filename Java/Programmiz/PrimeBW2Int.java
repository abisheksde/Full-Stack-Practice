public class PrimeBW2Int {

    static boolean isPrime(int num){

        boolean prime = true;

        for (int i = 2; i < num; i++){
            if(num%i==0){
                prime = false;
                break;
            }
        }

        return prime;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 100;

        for (int i = num1; i < num2; i++) {
            if(isPrime(i)){
                System.out.println(i + ", ");
            }
        }
    }
}
