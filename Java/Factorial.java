public class Factorial {
    public static void main(String[] args) {
        
        int fact = findFact(5);

        System.out.println("Factorial is : "+ fact);
    }

    public static int findFact(int num){

        if(num==0){
            return 1;
        }

        return num*findFact(num-1);
    }
}
