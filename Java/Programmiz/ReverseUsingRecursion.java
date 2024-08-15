public class ReverseUsingRecursion {
    public static void main(String[] args) {
        String sentence = "Go Home";
        String rev = revSentence(sentence);
        System.out.println(sentence.substring(1));
        System.out.println(sentence.charAt(0));

        System.out.println(rev);
    }

    static String revSentence(String sentence){
        if(sentence.isEmpty()){
            return sentence;
        }

        return revSentence(sentence.substring(1)) + sentence.charAt(0);
    }
}
