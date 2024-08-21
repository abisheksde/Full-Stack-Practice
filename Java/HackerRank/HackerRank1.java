/*
///TODO: Question
1. A professional society is using a program to determine possible diverse deputations of 3 members for an upcoming conference.
There are "m" men and "w" women who are eligible. A deputation is diverse only if it contains at least one man and at least one woman.
Two deputations are considered distinct if one has a member that the other does not. Given a number of men and women, determine the
number of distinct ways to select a diverse deputation of 3 people.

///TODO: Example
    m = 1
    w = 3
There is m=1 man available and there are w=3 women. Label them m1,w1,w2,w3 for demonstration.
There are 3 possible ways to form a diverse deputation. --> (m1,w1,w2), (m1,w1,w3) and (m1,w2,w3).
The only other possible permutation is (w1, w2, w3), which does not include a man, so it is invalid.

///TODO: Function Description

Complete the function diverseDeputation in the editor below.

diverseDeputation has the following parameters:
    int m: the number of men available.
    int w: the number of women available.

    Returns
    int: the number of ways to select a diverse deputation from "m" men and "w" women

///TODO:Constraints

    * 0 <= m, w <= 1000

///TODO: Input Format for Custom Testing

The first line contains a integer m, that denotes the number of men,
The second line contains an integer w, that denotes the number of women

///TODO: Sample case 0
Sample Input for Custom Testing

Standard Input --> 3 & 0
3 --> number of men m = 3
0 --> number of women w = 0

Sample Output = 0

Explanation:
The Number of women is 0, so there is no way to select a diverse deputation

///TODO: Sample case 1
Sample Input for Custom Testing

Standard Input --> 2 & 2
2 --> number of men m = 2
2 --> number of women w = 2

Sample Output = 4

Explanation:
In this case, m =2 and w=2.
This yields 4 ways to select a diverse deputation: (m1,w1,w2), (m1,m2,w2), (m2,w1,w2), (m1,m2,w1)

* */



class Result1 {

    /*
     * Complete the 'diverseDeputation' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER m
     *  2. INTEGER w
     */

    public static int diverseDeputation(int m, int w) {
/* 
        long allMembers = nCr((m+w), 3); // Possibilities of selecting 3 (r) out of 8(n)

        long allMan = nCr(m, 3);

        long allWomen = nCr(w, 3);

        long diverseDeputation = allMembers - allMan - allWomen;

*/
        long diverseDeputation = 0;
        for (int men = 1; men <= 2; men++) {
            int women = 3 - men;

            if(women == 2 || women == 1){
                diverseDeputation = diverseDeputation + nCr(m, men) * nCr(w, women);
            }
            
        }

        return (int)diverseDeputation;
    }

    static long nCr(int n, int r){ // Possibilities of selecting (r) out of (n)

        //The binomial coefficient is defined as:  𝑛! / 𝑟!*(𝑛 − 𝑟)!
        //However, directly calculating factorials can lead to very large numbers, which might cause overflow. 
        //Instead, we can compute the binomial coefficient iteratively. --> Formula is : nx(n−1)×(n−2)×…×(n−r+1)​/1×2×3×…×r.
        // Assume, n = 4, r = 2;
        // 4x3 / 1x2 (OR) 4x3 / 2x1
        // 4/1 x 3/2 (OR) 4/2 x 3/1
        // 4 x 1.5 (OR) 2 x 3 = 6//
        // For More Details --> https://youtu.be/bR7mQgwQ_o8
        if(r>n){
            return 0;
        }

        long res = 1;

        for (int i = 0; i < r; i++) {
            res = res * (n - i) / (i + 1);
            // First Iteration --> 1 x 4 / 1 = 4 (res = 4)
            // Second Iteration --> 4 x 3 / 2 = 6 (res = 6)
            // Third Iteration --> 6 x 2 / 3 = 4 (res = 4)
            // Last, It will return 4

            //res = res * (n - i) / (r - i);
            //System.out.println("RES : "+ res);

        }

        return res;

    }


}

public class HackerRank1 {
    public static void main(String[] args)  {
        int result = Result1.diverseDeputation(4, 4);

        System.out.println(result);
    }
}
