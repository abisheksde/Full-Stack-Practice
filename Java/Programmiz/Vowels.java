
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        
        Scanner scanner = new  Scanner(System.in);

        System.out.println("Please Enter a String : ");

        String str = scanner.nextLine();

        str = str.toLowerCase();

        int a=0, e=0, i=0, o=0, u=0;

        for(int j = 0; j<str.length(); j++){
            if(str.charAt(j)=='a'){
                a++;
            }
            if(str.charAt(j)=='e'){
                e++;
            }
            if(str.charAt(j)=='i'){
                i++;
            }
            if(str.charAt(j)=='o'){
                o++;
            }
            if(str.charAt(j)=='u'){
                u++;
            }
        }

        System.out.println("A : " + a + " E : " + e +" I : " + i +" O : "+ o +" U : " + u);

        int total = a+e+i+o+u;
        System.out.println("Total Vowels "  + total);


    }
}
