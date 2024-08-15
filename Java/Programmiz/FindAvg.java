public class FindAvg {
    public static void main(String[] args) {
        int arr[] = {10, 15, 20, 13, 6};

        System.out.println("Average :" + findAvg(arr));

    }

    static double findAvg(int[] arr){

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum/arr.length;
        
    }
}
