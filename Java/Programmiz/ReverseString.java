public class ReverseString {

    public static void main(String[] args) {
        String str = "Abishek";
        String revName = reverse(str);

        System.out.println(revName);

    }

    static String reverse(String str){
        String revStr = "";
        int length = str.length();

        for (int i = length-1; i >= 0; i--) {
            revStr = revStr + str.charAt(i);
        }
        return revStr;
    }
}
