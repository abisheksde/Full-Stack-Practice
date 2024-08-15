public class Power {
    public static void main(String[] args) {

        int n = 5;

        int temp = n;
        for (int i = 1; i < temp; i++) {
            
            n = n*temp;
            // We multiplay Two 5 out of Five 5 here
            // So, We don't need to start with i = 0
        }

        System.out.println(n);
    }
}
