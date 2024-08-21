
import java.util.ArrayList;
import java.util.List;

public class CountOfSubsequence {
    static  int[] arr = {3,1,2};
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        System.out.println("Total Subsequence is : "+fun(0, a));

    }

    static int fun(int n, List<Integer> a){
        if(n>=arr.length){
            return 1;
        }

        a.add(arr[n]);
        int l = fun(n+1, a);
        a.remove(a.size()-1);
        int r = fun(n+1, a);

        return l + r;
    }
}
