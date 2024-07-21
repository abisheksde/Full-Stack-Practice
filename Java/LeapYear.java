public class LeapYear {
    public static void main(String[] args) {
        int year = 2004;
        boolean leap;

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    leap = true;
                } else {
                    leap = false;
                }
            } else{
                leap = true;
            }
        } else {
            leap = false;
        }

        if(leap){
            System.out.println("This is a Leap Year");
        } else{
            System.out.println("This is Not a Leap Year");
        }
    }
}
