public class FindFrequencyUsingHashing {
    public static void main(String[] args) {
         int[] arr = {1,5,5,3,21,1};
         int[] find = {5,3,1};

         int[] frequency = findFrequency(arr, find);

         for (int i : find) {
             System.out.println(frequency[i] +", ");
         }

    }

    static int[] findFrequency(int[] arr, int[] find){
        int tableLenght = 22;
        int[] hashTable = new int[tableLenght];
        for (int i = 0; i < arr.length; i++) {
            hashTable[arr[i]]++;
        }

        return hashTable;
    }
}
