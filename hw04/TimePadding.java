//Amanda Ritter
//hw04
//Time Padding Java Program
//
//This program calculates the time of day from a given amount of seconds passed. 
//First compile the program 
    //javac TimePadding.java
//Then run the program
    //java TimePadding
    
import java.util.Scanner; //import scanner

public class TimePadding {
    //main method required for every program 
    public static void main(String[] args) { 
        
        //introduce scanner
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print(
            "Enter the time in seconds: ");
            int TimeSec = 0;
            TimeSec = myScanner.nextInt();
        
        int TimeHr = TimeSec/3600;
        int RemainingSeconds = TimeSec % 3600;
        int TimeMin = RemainingSeconds/60;
        int RemainingSeconds1 = RemainingSeconds % 60; 
        
        if (TimeHr<10 && TimeMin<10 && RemainingSeconds1<10) {
            System.out.println("The time in seconds is 0"+TimeHr+":0"+TimeMin+":0"+RemainingSeconds1+".");
        }
        else if(TimeHr<10 && TimeMin>10 && RemainingSeconds1<10) {
            System.out.println("The time in seconds is 0"+TimeHr+":"+TimeMin+":0"+RemainingSeconds1+".");
        }
        else if(TimeHr<10 && TimeMin<10 && RemainingSeconds1>10) {
            System.out.println("The time in seconds is 0"+TimeHr+":"+TimeMin+":"+RemainingSeconds1+".");
        }
        else if(TimeHr>10 && TimeMin>10 && RemainingSeconds1<10) {
            System.out.println("The time in seconds is "+TimeHr+":"+TimeMin+":0"+RemainingSeconds1+".");
        }
        else if(TimeHr>10 && TimeMin>10 && RemainingSeconds1>10) {
            System.out.println("The time in seconds is "+TimeHr+":"+TimeMin+":"+RemainingSeconds1+".");
        }
        else if(TimeHr<10 && TimeMin>10 && RemainingSeconds1>10) {
            System.out.println("The time in seconds is 0"+TimeHr+":"+TimeMin+":"+RemainingSeconds1+".");
        }
      
        }//end of main method
    
    }//end of class