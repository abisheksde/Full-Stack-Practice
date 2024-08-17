public class ReverseAnArrayUsingLoop {
    
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7,2,5};

        for (Object i : reverse(arr)) {
            System.out.println(i);
        }
        
    }

    static int[] reverse(int[] arr){
        int l = 0, m = arr.length-1;
        
        
        while (l<m) { 
            
            int temp = arr[l];
            arr[l] = arr[m];
            arr[m] = temp;
            l++;
            m--;
        }

        return arr;
    }
}
