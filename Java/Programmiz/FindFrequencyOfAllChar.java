public class FindFrequencyOfAllChar {
    public static void main(String[] args) {
        String sentence = "Abishek Thankaswamy 5$*^!$";
        char[] find = {'a','A','5','$'};

        int[] frequency = findFrequency(sentence);

        for (char i : find) {
            System.out.println(frequency[i]+ ",");
        }

    }

    static int[] findFrequency(String sentence){
        int tableLenght = 256;
        int[] hashTable = new int[tableLenght];

        for (int i = 0; i < sentence.length(); i++) {
            int n = sentence.charAt(i);
            hashTable[n]++;
        }

        return hashTable;
    }
}
