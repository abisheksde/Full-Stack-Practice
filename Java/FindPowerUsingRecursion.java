public class FindPowerUsingRecursion {
    public static void main(String[] args) {
        int base = 3;
        int pow = 4;

        System.out.println("Power : "+ power(base, pow));

    }

    static int power(int base, int pow){

        if (pow>0) {
            return  base * power(base, pow-1);
        } else {
            return 1;
        }
    }
}
