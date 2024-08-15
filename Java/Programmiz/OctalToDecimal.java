public class OctalToDecimal {
    public static void main(String[] args) {
        //https://youtu.be/0zFB0Fj-tRQ

        int num = 170;

        System.out.println(convertToDecimal(num));
    }

    static double  convertToDecimal(int num){
        int i = 0;
        double res = 0;

        while (num>0) { 
            int reminder = num%10;

            res = res + reminder * Math.pow(8, i);
            num = num/10;
            i++;

        }

        return res;
    }
}
