public class FindVowels {
    public static void main(String[] args) {
        String str = "This website is aw3som3.";

        int[] arr = findVowels(str);

        System.out.printf(" Vowels = %d, \n Consonants = %d, \n Digits = %d, \n White Space = %d ", arr[0],arr[1],arr[2],arr[3]);
    }

    static int[] findVowels(String str){
        String line = str.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int whitespace = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) =='a' ||  line.charAt(i) =='e' || line.charAt(i) =='i' || line.charAt(i) =='o' || line.charAt(i) =='u') {
                vowels++;
            } else if(line.charAt(i) > 'a' && line.charAt(i) < 'z'){
                consonants++;
            } else if(line.charAt(i) > '0' && line.charAt(i) < '9'){
                digits++;
            } else if(line.charAt(i) == ' '){
                whitespace++;
            }
        }

        int[] arr = new int[4];

        arr[0] = vowels;
        arr[1] = consonants;
        arr[2] = digits;
        arr[3] = whitespace;

        return arr;
    }
}
