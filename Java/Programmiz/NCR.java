public class NCR {
    public static void main(String[] args) {
        long nCr = nCr(8, 3); // Possibilities of selecting 3 (r) out of 8(n)
        System.out.println(nCr);
    }
    private static long nCr(int n, int r) {
        // If r is greater than n, return 0 since it's not possible to choose more items than are available
        if (r > n) {
            return 0;
        }
    
        long res = 1; // Initialize result variable
    
        // Loop through to calculate the binomial coefficient
        for (int i = 0; i < r; i++) {
            res *=  (n - i) / (i + 1);
        }
    
        return res; // Return the final result
    }
}
