public class FindFrequencyofCharUsingHashing {
    public static void main(String[] args) {
        String sentence = "Abishek Thankaswamy";
        char[] find = {'a','h','k','n'};

        int[] frequency = findFrequency(sentence);

        

        for (int i : find) {
            int a = i-'a';
            System.out.println(frequency[a]+" , ");
        }
    }

    static int[] findFrequency(String sentence){
        int tableLenght = 26;

        String lowSentence = sentence.toLowerCase();

        String newSentence = lowSentence.replaceAll("\\s", "");

        int[] hashTable = new int[tableLenght];

       

        for (int i = 0; i < newSentence.length(); i++) {
            int a = newSentence.charAt(i)-'a';
            //System.out.println(hashTable[i]+" , " + a);
            hashTable[a]++;
            
        }
        

        return hashTable;
    }
}
