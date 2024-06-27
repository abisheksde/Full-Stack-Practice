import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Please Enter a Array with Size 5 : ");

        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        
        Arrays.sort(arr);
        
        System.out.println("The Second Largest Number is : "+ arr[arr.length-2]);
    }
}
