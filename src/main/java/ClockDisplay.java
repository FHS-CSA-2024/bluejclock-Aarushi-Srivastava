package src.main.java;

public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    
    public ClockDisplay() {
        this.hours = new NumberDisplay(24);
        this.minutes = new NumberDisplay(60);
    }
    
    public ClockDisplay(int hour, int minute) {
        this.hours = new NumberDisplay(24);
        this.minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }
    
    public void setTime(int hour, int minute) {
        this.hours.setValue(hour);
        this.minutes.setValue(minute);
    }
    
    public String getTime() {
        return hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }
    
    public void timeTick() {
        minutes.increments();
        if (minutes.getValue() == 0) {  // If minutes roll over to 0, increment hours
            hours.increments();
        }
    }
}
