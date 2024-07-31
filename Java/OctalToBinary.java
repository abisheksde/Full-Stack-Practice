public class OctalToBinary {
    public static void main(String[] args) {
        //https://youtu.be/dE17Ijz_6Yk

        int num = 67;

        System.out.println(convertToBinary(num));


    }
    static long convertToBinary(int num){
        int i = 0;
        int decimal = 0; 
        while (num>0) { 
            int reminder = (int)num%10;
            decimal = (int)(decimal + reminder * Math.pow(8, i));
            num = num/10;
            i++;
        }

        int j = 1;
        int binary = 0;
        while (decimal>0) { 
            int reminder = decimal%2;
            decimal = decimal/2;
            binary = binary + reminder*j;
            j = j*10;
        }

        return binary;
    }

}
