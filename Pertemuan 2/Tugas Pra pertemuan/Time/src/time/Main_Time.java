package time;

/**
 *
 * @author U53R
 */
public class Main_Time {
    public static void main(String[] args){
        Time currentTime1 = new Time(10, 0, 59);
        System.out.println("Current Time1: " + currentTime1.toString());
        Time nextSecond1 = currentTime1.nextSecond();
        System.out.println("Next Second1: " + nextSecond1.toString());
        Time previousSecond1 = currentTime1.previousSecond();
        System.out.println("Previous Second1: " + previousSecond1.toString());
        
        Time currentTime2 = new Time(10, 0, 0);
        System.out.println("\nCurrent Time2: " + currentTime2.toString());
        Time nextSecond2 = currentTime2.nextSecond();
        System.out.println("Next Second2: " + nextSecond2.toString());
        Time previousSecond = currentTime2.previousSecond();
        System.out.println("Previous Second2: " + previousSecond.toString());

    }
    
}
