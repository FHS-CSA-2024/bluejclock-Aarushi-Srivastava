package src.main.java;

public class ClockDisplay12Hour {
    private int hours;    
    private int minutes; 
    private boolean PM; 

    
    public ClockDisplay12Hour() {
        hours = 12;
        minutes = 0;
        PM = false;
    }

    
    public ClockDisplay12Hour(int hour, int minute, boolean pm) {
        setTime(hour, minute, pm);
    }

    
    public void setTime(int hour, int minute, boolean pm) {
        if (hour >= 1 && hour <= 12) {
            hours = hour;
        } else {
            hours = 12; 
        }

        if (minute >= 0 && minute < 60) {
            minutes = minute;
        } else {
            minutes = 0;  
        }

        PM = pm;
    }

    
    public String getTime() {
        String hourString;
        String minString;
        
        
        if (hours < 10) {
            hourString = "0" + hours;
        } else {
            hourString = Integer.toString(hours);
        }

        if (minutes < 10) {
            minString = "0" + minutes;
        } else {
            minString = Integer.toString(minutes);
        }

        String period = "AM";
        if (PM) {
            period = "PM";
        }

        return hourString + ":" + minString + " " + period;
    }

    
    public void timeTick() {
        minutes=minutes+1;
        if (minutes == 60) {
            minutes = 0;
            hours=hours+1;
            if (hours == 12) {
                PM = !PM; 
            } else if (hours > 12) {
                hours = 1;  
            }
        }
    }
}
