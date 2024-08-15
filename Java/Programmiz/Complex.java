public class Complex {

    double real;
    double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }


    public static void main(String[] args) {
        Complex n1 = new Complex(2.3, 4.5);
        Complex n2 = new Complex(3.4, 5.0);

        Complex temp = addComplex(n1, n2);

        System.out.println("The Real Number is : " + temp.real + "The Imaginary is : "+ temp.imaginary);
        
    }

    static Complex addComplex(Complex n1, Complex n2){
        Complex temp = new Complex(0.0,0.0);
        temp.real = n1.real + n2.real;
        temp.imaginary = n1.imaginary + n2.imaginary;

        return temp;
    }
}
