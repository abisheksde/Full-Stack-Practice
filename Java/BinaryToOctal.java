public class BinaryToOctal {
    public static void main(String[] args) {
        //https://youtu.be/dE17Ijz_6Yk

        long num = 101001;
        System.out.println(convertToOctal(num));


    }

    static int convertToOctal(long num){
        
        int i = 0;
        int decimal = 0;

        while (num>0) { 
            int reminder = (int)(num%10);
            decimal = (int)(decimal + reminder * Math.pow(2, i));
            num = num/10;
            i++;
            
        }

        int j = 1;
        int octal = 0;

        while (decimal>0) { 
            int reminder = decimal%8;
            decimal = decimal/8;
            octal = octal + reminder*j;

            j = j*10;
        }
        return octal;
    }
}
