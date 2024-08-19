
import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequence {
    static int[] arr = {3,1,2};
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        fun(0, a);
    }

    static void  fun(int n, List<Integer> a){
        if(arr.length <= n){
            for (int i = 0; i < a.size(); i++) {
                System.out.print(a.get(i) + " , ");
            }
            System.out.println("\n");
            return;
        }

        a.add(arr[n]);
        fun(n+1, a);
        a.remove(a.size()-1); // When you remove an element from the list, you should remove it by its index, not by its value.
        fun(n+1, a);
    }
}
