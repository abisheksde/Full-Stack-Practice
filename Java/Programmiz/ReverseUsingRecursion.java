public class ReverseUsingRecursion {
    static int[] arr = {1,4,5,6,7,2,5};

    public static void main(String[] args) {

        reverse(0);
    
        for (int i : arr) {
            System.out.println(i);
        }
        

    }

    static void reverse(int i){
        //System.out.println("------------------------------------------------------");
        int n = (arr.length-i)-1;
        //System.out.println("n = "+n);
        //System.out.println("i = "+i);
        if(i>=n){
            return;
        } 

        
        int temp = arr[i];
        //System.out.println("Temp = "+temp);
        arr[i] = arr[n];
        //System.out.println("arr[i] = "+arr[i]);
        arr[n] = temp;
        //System.out.println("arr[n] = "+arr[n]);

        //System.out.println("===");

        // if(i>0){
        //     System.out.println("arr[i-1] = "+ arr[i-1]);
        //     System.out.println("arr[n+1] = "+ arr[n+1]);
        // }

        reverse(i+1);

    }
}
