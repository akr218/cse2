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
        
        double TimeHr = TimeSec/3600;
        double TimeMin = 0;
        TimeHr%=TimeMin;
        double TimeMin1 = TimeMin*60;
        double TimeSec1 = 0;
        TimeMin1%=TimeSec1;
        double TimeSec2 = TimeSec1*60;
        
        System.out.println("The time in seconds is "+(int) TimeHr+":"+(int)TimeMin1+":"+(int)TimeSec2);
        
        }//end of main method
    
    }//end of class