public class FindLargestOfAnArray {
    public static void main(String[] args) {
        int[] arr = {10, 15, 13, 21, 92, 42, 10};

        System.out.println("Largest Element is : "+findLargest(arr));
    }

    static int findLargest(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }

        return max;
    }
}
