public class Armstrong {
    public static void main(String[] args) {
        int count = 0;
        
        int n = 153;
        int last;
        int number = n;
        int input = n;
        
        int lastDigit;

        //To Find Count of Digit
        while (n != 0) { 
            last = n%10;
            n = n/10;
            count++;  
        }

        //Array initialized based on Count
        int[] arr = new int[count];
        int i =0;

        // Store Every Digit of number, in  Array
        while (number != 0) { 
            lastDigit = number%10;
            number = number/10;
            arr[i] = lastDigit;
            i++;
        }

        int l = 0;
        int sum = 0;


        //Find Power & Sum of All Digits
        for (int j = 0; j < arr.length; j++) {
            int temp = arr[j];
            while (l<count-1) { 
                arr[j] = arr[j]*temp;
                l++;
            }
            l=0;

            sum = sum + arr[j];

            
            // System.out.println(arr[j]);
            // System.out.println(sum);
            
        }
        if(input== sum){
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("It is Not an Armstrong Number");
        }
        
    }
}
