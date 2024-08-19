
import java.util.ArrayList;
import java.util.List;

public class PrintSubsequenceWhoesSumOfK {
    static int[] arr = {1,2,1};
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        int targetSum = 2;
        fun(0, a, 0, targetSum);
        
    }

    static void fun(int i, List<Integer> a, int currentSum, int targetSum){
        
        if(arr.length <= i){
            if(currentSum==targetSum){
                for (int j = 0; j < a.size(); j++) {
                    System.out.print(a.get(j) + " , ");
                }
                System.out.println("\n");
            }
            return;
        }

        a.add(arr[i]);
        currentSum = currentSum + arr[i];
        fun(i+1, a, currentSum, targetSum);
        a.remove(a.size()-1);
        currentSum = currentSum - arr[i];
        fun(i+1, a, currentSum, targetSum);
    }
}
