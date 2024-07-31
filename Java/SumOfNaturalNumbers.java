public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int num = 20;
        // 1+2+3+4+5+.............+20 = ?

        System.out.println(SumOfNaturalNumbers(num));

    }

    static int SumOfNaturalNumbers(int num){

        if(num==1){
            return 1;
        }

        return num+SumOfNaturalNumbers(num-1);
    }
}
