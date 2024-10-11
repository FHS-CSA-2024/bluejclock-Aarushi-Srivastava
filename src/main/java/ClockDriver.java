package src.main.java;

public class ClockDriver {
    public static void main(String[] args) {
        // Test for basic 24-hour ClockDisplay
        
        ClockDisplay test1 = new ClockDisplay();
        System.out.println("Empty Constructor Test: " + test1.getTime());  
        
        ClockDisplay test2 = new ClockDisplay(3, 32);
        System.out.println("Constructor with time test: " + test2.getTime());
        
        test2.setTime(9, 59);
        System.out.println("Set Time Test: " + test2.getTime());
        
        test2.timeTick();
        System.out.println("Tick 09:59 to 10:00 Test: " + test2.getTime());
        
        ClockDisplay tickTest1 = new ClockDisplay(23, 59);
        System.out.println("Tick Test 1 Before: " + tickTest1.getTime());  
        tickTest1.timeTick();
        System.out.println("Tick Test 1 After: " + tickTest1.getTime()); 

        ClockDisplaySeconds test1Sec=new ClockDisplaySeconds();
        System.out.println("Sec Empty Con. Test:"+ test1Sec.getTime());
        
        ClockDisplaySeconds test2Sec=new ClockDisplaySeconds(6,49,0);
        System.out.println("Sec 2 arg. Con. Test:"+ test2Sec.getTime());
        
        ClockDisplaySeconds ticTest1Sec=new ClockDisplaySeconds(3,32,59);
        System.out.println("Sec Tick Test 1 Before:"+ ticTest1Sec.getTime());
        ticTest1Sec.timeTick();
        System.out.println("Sec 1 Test After:"+ ticTest1Sec.getTime());
        
        ClockDisplaySeconds ticTest2Sec=new ClockDisplaySeconds(1,0,59);
        System.out.println("Sec Tick Test 2 Pretick:"+ ticTest2Sec.getTime());
        ticTest2Sec.timeTick();
        System.out.println("Sec 2 Test Posttick:"+ ticTest2Sec.getTime());
        
        ClockDisplaySeconds ticTest3Sec=new ClockDisplaySeconds(1,59,59);
        System.out.println("Sec Tick Test 3 Before:"+ ticTest3Sec.getTime());
        ticTest3Sec.timeTick();
        System.out.println("Sec 3 Test After:"+ ticTest3Sec.getTime());
        
        ClockDisplaySeconds ticTest4Sec=new ClockDisplaySeconds(23,59,59);
        System.out.println("Sec Tick Test 4 Before:"+ ticTest4Sec.getTime());
        ticTest4Sec.timeTick();
        System.out.println("Sec 4 Test After:"+ ticTest4Sec.getTime());
        
        
        
        //Test for 12 hour clock
        
        ClockDisplay12Hour clock1 = new ClockDisplay12Hour();
        System.out.println("12 Hour Empty Con. Test: " + clock1.getTime()); 

        ClockDisplay12Hour clock2 = new ClockDisplay12Hour(3, 32, true);
        System.out.println("12 Hour Test 2 Constructor with time: " + clock2.getTime());

        clock2.setTime(5, 45, false);
        System.out.println("Test 3 set time: " + clock2.getTime()); 

        clock2.timeTick();
        System.out.println("Test 4 Tick time: " + clock2.getTime());
      
        ClockDisplay12Hour clock3 = new ClockDisplay12Hour(3, 32, true);
        
        System.out.println("Test 5 Before: " + clock3.getTime()); 
        clock3.timeTick();
        System.out.println("Test 5 After: " + clock3.getTime()); 
        
        
        ClockDisplay12Hour clock4 = new ClockDisplay12Hour(11, 59, true);
        System.out.println("Test 6 Before: " + clock4.getTime()); 
        clock4.timeTick();
        System.out.println("Test 6 After: " + clock4.getTime()); 

        
        ClockDisplay12Hour clock5 = new ClockDisplay12Hour(11, 59, false);
        System.out.println("Test 7 Before: " + clock5.getTime()); 
        clock5.timeTick();
        System.out.println("Test 7 After: " + clock5.getTime()); 

        
        ClockDisplay12Hour clock6 = new ClockDisplay12Hour(12, 59, true);
        System.out.println("Test 8 Before: " + clock6.getTime()); 
        clock6.timeTick();
        System.out.println("Test 8 After: " + clock6.getTime()); 
        
        
    }
}
