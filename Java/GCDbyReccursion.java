public class GCDbyReccursion {
    public static void main(String[] args) {
        int num1 = 18;
        int num2 = 12;
        int hcf = findGCD(num1, num2);
        System.out.println("GCD is : " + hcf);
    }

    static int findGCD(int num1, int num2){
        
        if(num2 != 0){
            return findGCD(num2, num1%num2);
            //(12, 18%12) = (12, 6)
            //(6, 12%6) = (6, 0)
        } else {
            return  num1;
        }
    }
}