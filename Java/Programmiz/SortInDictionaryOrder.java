public class SortInDictionaryOrder {
    public static void main(String[] args) {
        String[] words = {"Java", "Python", "C", "Ruby", "JavaScript", "Dart"};

        String[] sortedWords = sortByDictionary(words);

        for (int i = 0; i < words.length; i++) {
            System.out.println(sortedWords[i]);
        }
    }

    static String[] sortByDictionary(String[] words){
        // Need more knowledge about Java String compareTo() method.
        //https://www.w3schools.com/java/ref_string_compareto.asp
        //https://www.javatpoint.com/java-string-compareto
        //https://www.geeksforgeeks.org/java-string-compareto-method-with-examples/
        for (int i = 0; i < words.length-1; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (words[i].compareTo(words[j])>0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        return words;
    }
}
