public class FindStandardDeviation {
    public static void main(String[] args) {
        double[] numArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println(standardDeveiation(numArray));
    }

    static double standardDeveiation(double[] arr){
        double sum = 0.0;
        double standardDeviation = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        double mean = sum/arr.length; // Avarage

        for (double num : arr) {
            standardDeviation = standardDeviation + Math.pow(num-mean, 2);
        }

        return Math.sqrt(standardDeviation/arr.length);
    }
}
