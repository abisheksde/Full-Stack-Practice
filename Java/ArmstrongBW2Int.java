public class ArmstrongBW2Int {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2000;
        int count;

        for (int i = num1; i < num2; i++) {
            count = countOfDigit(i);
            if(isArmstrong(i, count)){
                System.out.println( i + ", ");
            }
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

    static boolean isArmstrong(int num, int count){
        int originalNumber = num;
        int sum = 0;
        while (num>0) {
            int temp = num%10;
            temp = (int)Math.pow(temp, count);
            sum = sum + temp;
            num = num/10;
        }
        if(originalNumber == sum){
            return  true;
        } else {
            return false;
        }
    }
}
