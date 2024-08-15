public class LCMof2 {
    public static void main(String[] args) {
        int a = 10,b=15;
        int lcm;

        if(a>b){
            lcm = a;
        } else{
            lcm = b;
        }

        while (true) { 
            if(lcm%a==0 && lcm%b==0){
                System.err.println(lcm);
                break;
            }
            lcm++;
        }
    }
}