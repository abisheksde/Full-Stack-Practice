public class DecimalToOctal {
    public static void main(String[] args) {
        //https://youtu.be/v2JsaEJBbHo

        int num = 120;

        System.out.println(convertToOctal(num));
    }

    static int convertToOctal(int num){

        int i = 1;
        int octal =0;

        while (num>0) { 
            int reminder = num%8;
            num = num/8;

            octal = octal + reminder * i;

            i = i*10;

        }
        return octal;
    }
}
