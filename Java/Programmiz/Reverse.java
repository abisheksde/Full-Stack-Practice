public class Reverse {
    public static void main(String[] args) {

        int n = 512;

        int arr[] = new int[3];

        int rev;

        
        for(int i=0; i<arr.length; i++){
            rev = n%10;
            arr[i] = rev;
            n = n/10;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }



    }
}
