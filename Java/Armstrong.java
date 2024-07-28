public class Armstrong {
    public static void main(String[] args) {
        int originalNumber = 370;
        int num = originalNumber;
        int count = countOfDigit(num);
        int sum = 0;

        while (num>0) { 
            int temp = num%10;
            temp = (int)Math.pow(temp, count); //OR - Manually Find Power of a number
            sum = sum + temp;
            num = num/10;
        }

        if(originalNumber==sum){
            System.out.println("The Number is Armstrong");
        } else {
            System.out.println("The Number is Not an Armstrong");
        }


    }

    static int countOfDigit(int num){
        int count = 0;
        while (num>0) { 
            num = num/10;
            count++;
        }
        return count;
    }
}
