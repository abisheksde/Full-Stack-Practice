

public class PalindromeUsingRecursion {
    static String name = "Malayalam";
    
    public static void main(String[] args) {


        if(palindrome(0)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        System.out.println(palindrome(0));
    }

    static boolean palindrome(int i){
        int n = name.length()-i-1;
        if(i>=n) return true;
        if(name.charAt(i) != name.charAt(n)){
            return false;
        }

        return palindrome(i+1);
    }
}
