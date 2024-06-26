public class HCF {
    public static void main(String[] args) {
        int a=11;
        int b=20;

        while(a != 0){
            int temp = a;
            a = b%a;  
            b = temp;
        }

        System.out.println(b);
    }
}
