public class DecimalToBinary {
    public static void main(String[] args) {
        //https://youtu.be/tN--3P7SaBM

        
        int num = 19;

        System.out.println(convertToBinary(num));

    }

    static long convertToBinary(int num){

        long binary = 0;
        int i = 1;

        while (num>0) { 
            int reminder = num%2;

            num = num/2;

            binary = binary + reminder * i;

            i = i*10;
        }

        return binary;
    }
}
