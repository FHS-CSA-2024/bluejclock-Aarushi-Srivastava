package src.main.java;

public class ClockDisplaySeconds {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;

    // Constructor with no parameters (initializes time to 00:00:00)
    public ClockDisplaySeconds() {
        this.hours = new NumberDisplay(24);  
        this.minutes = new NumberDisplay(60); 
        this.seconds = new NumberDisplay(60);  
    }

    // Constructor with specified hour, minute, and second
    public ClockDisplaySeconds(int hour, int minute, int second) {
        this.hours = new NumberDisplay(24);
        this.minutes = new NumberDisplay(60);
        this.seconds = new NumberDisplay(60);
        setTime(hour, minute, second); 
    }

    // Set the time
    public void setTime(int hour, int minute, int second) {
        this.hours.setValue(hour);
        this.minutes.setValue(minute);
        this.seconds.setValue(second);
    }

    // Method to return the time as a string in the format HH:MM:SS
    public String getTime() {
        return hours.getDisplayValue() + ":" + minutes.getDisplayValue() + ":" + seconds.getDisplayValue();
    }

    // Method to simulate the clock ticking by one second
    public void timeTick() {
        seconds.increments();  
        if (seconds.getValue() == 0) {  
            minutes.increments();
            if (minutes.getValue() == 0) {  
            hours.increments();
            }
        }
    }
}
