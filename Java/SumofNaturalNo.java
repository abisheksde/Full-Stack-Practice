public class SumofNaturalNo {
    public static void main(String[] args) {
        int sum = sumOfNaturalNumbers(20);
        System.out.println("Sum of Natural Numbers : "+ sum);

    }

    public static int sumOfNaturalNumbers(int num){
        if(num==1){
            return 1;
        }


        return num+sumOfNaturalNumbers(num-1);
    }
}
