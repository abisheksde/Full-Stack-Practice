public class DifferenceBWTwoTime {
    public static void main(String[] args) {
        Time t1 = new Time(10, 59, 59);
        Time t2 = new Time(12, 59, 59);

        Time difference = findDifference(t1, t2);

        System.out.printf("%d : %d : %d",difference.hours, difference.minutes, difference.seconds);
    }

    static Time findDifference(Time t1, Time t2){
        Time temp = new Time(0, 0, 0);

        temp.hours = t2.hours -  t1.hours;

        if(t1.minutes + t2.minutes >= 60){
            temp.hours++;
            temp.minutes = (t2.minutes + t1.minutes) - 60;
        } else{
            temp.minutes = t2.minutes - t1.minutes;
        }
        
        if(t1.seconds + t2.seconds >= 60){
            temp.seconds = (t2.seconds + t1.seconds) - 60;
            temp.minutes++;
        } else{
            temp.seconds = t2.seconds - t1.seconds;
        }
        

        return temp;
    }
}

class Time{
    int hours;
    int minutes;
    int seconds;

    Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
}