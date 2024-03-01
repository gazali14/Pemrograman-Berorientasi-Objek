package time;

/**
 *
 * @author U53R
 */
public class Time {
    private int hour;
    private int minute;
    private int second;
    
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public int getHour(){
        return hour;
    }
    
    public int getMinute(){
        return minute;
    }
    
    public int getSecond(){
        return second;
    }
    
    public void setHour(int hour){
        this.hour = hour;
    }
    
    public void setMinute(int minute){
        this.minute = minute;
    }
    
    public void setSecond(int second){
        this.second = second;
    }
    
    public void setTime(int hour, int minut, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public Time nextSecond() {
        int nextSecondValue = (second + 1) % 60;
        int nextMinuteValue = minute;
        int nextHourValue = hour;

        if (nextSecondValue == 0) {
            nextMinuteValue = (minute + 1) % 60;

            if (nextMinuteValue == 0) {
                nextHourValue = (hour + 1) % 24;
            }
        }

        return new Time(nextHourValue, nextMinuteValue, nextSecondValue);
    }

    public Time previousSecond() {
        int previousSecondValue = second - 1;
        int previousMinuteValue = minute;
        int previousHourValue = hour;

        if (previousSecondValue < 0) {
            previousSecondValue = 59;

            if (minute == 0) {
                previousMinuteValue = 59;

                if (hour == 0) {
                    previousHourValue = 23;
                } else {
                    previousHourValue = hour - 1;
                }
            } else {
                previousMinuteValue = minute - 1;
            }
        }

        return new Time(previousHourValue, previousMinuteValue, previousSecondValue);
    }
    
    public String toString()
    {
        return (this.hour+":"+this.minute+":"+this.second);
    }
    
    
}