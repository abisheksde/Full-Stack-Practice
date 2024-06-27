public class ArmstrongB2Int {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 2000;
        int n;
        int last;
        int lastDigit;

        for(int i=num1; i<=num2; i++){
            int count = 0;
            n=i;
            int num = i;
            int input = i;
            while (n != 0) { 
                last = n%10;
                n = n/10;
                count++;  
            }

            //System.out.println(count);

            int[] arr = new int[count];
            int k =0;

            while (num != 0) { 
                lastDigit = num%10;
                num = num/10;
                arr[k] = lastDigit;
                k++;
            }

            // for (int j = 0; j < arr.length; j++) {
            //     System.out.println("Array is : "+arr[j]);
            // }

            int l = 0;
            int sum=0;

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
                System.out.println(input);
            } 

        } 

        
    }
}
