
import java.util.ArrayList;
import java.util.List;

public class PrintFirstSubsequence {
    static int[] arr = {3,2,1};
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        fun(0, a);
    }

    static boolean fun(int n, List<Integer> a){

        if(n >= arr.length){
            for (int i = 0; i < a.size(); i++) {
                System.out.print(a.get(i)+ " , ");
            }
            System.out.println("\n");
            return true;
        }

        a.add(arr[n]);
        if(fun(n+1, a)==true){
            return true;
        }
        a.remove(a.size()-1);
        fun(n+1, a);

        return false;
    }
}
