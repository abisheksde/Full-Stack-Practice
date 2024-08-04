public class FindFrequencyOfChar {
    public static void main(String[] args) {
        String str = "Java is an Awesome Programming Language";

        char find = 'e';

        int frequency = findFrequency(find, str);

        System.out.println(frequency);
    }

    static int findFrequency(char c, String str){
        int frequency = 0;
        for (int i = 0; i < str.length(); i++) {
            if(c == str.charAt(i)){
                frequency++;
            }
        }

        return frequency;
    }
}
