public class LCM {
    public static void main(String[] args) {

        //https://youtu.be/PSJuk176zKI
        
        int num1 = 10;
        int num2 = 15;

        int num = num1 > num2 ? num1 : num2;

        while (true) { 
            if(num%num1==0 && num%num2==0){
                System.out.println(num);
                break;
            }
            num++;
        }

        /// For Example: num1=3 & num2 =6.
        /// Multiples of 3 is : 3, 6, 9, 12, 15, 18.
        /// Multiples of 6 is : 6, 12, 18, 24.
        /// Loop Starts from Big Number, which is num2 = 6;
        /// Now, num = num2 = 6;
        /// Now we need to find, num & num++ is divisible by both num1 & num2
        /// Which num or num++ is divisible first, by both num1 & num2. That is the LCM

        

    }
}
