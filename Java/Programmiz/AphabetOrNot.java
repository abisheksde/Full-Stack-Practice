public class AphabetOrNot {
    public static void main(String[] args) {
        char a = 'f';

        if(a >= 'a' && a <= 'z' || a >= 'A' && a <= 'Z'){
            System.out.println("Given Character is Alphabet");
        } else {
            System.out.println("It is Not an Alphabet");
        }

    }
}
