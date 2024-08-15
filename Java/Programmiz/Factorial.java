public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(findFact(num));

    }

    static int findFact(int num){
        if(num==1){
            return 1;
        }

        return num*findFact(num-1);
    }
}
