public class FibonacciBySwap {
    public static void main(String[] args) {
        int num1 = 10;

        int num2 = 100;

        int first = 0;
        int second = 1;
        int next;

        for (int i = 0; i < num1; i++) {
            System.out.print(first + " ,");
            next = first + second;
            first = second;
            second = next;


        }

        System.out.println("\n");

        first = 0;
        second = 1;

        while (num2 >= first) { 
            System.out.print(first + ", ");
            next = first + second;
            first = second;
            second = next;
        }


    }
}
