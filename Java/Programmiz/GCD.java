public class GCD {
    public static void main(String[] args) {

        //https://www.youtube.com/watch?v=ZJkuuUE1pgQ
        
        int num1 = 40;
        int num2 = 87;

        int num = num1 > num2 ? num1 : num2;

        for (int i = num; i > 0; i--) {
            if(num1%i==0 && num2%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}
