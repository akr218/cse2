//Amanda Ritter
//hw03
//Bicycle Java Program
//
//This program prints out the distance traveled and average miles per hour
//First compile the program
    //javac Bicycle.java
//Then run the program 
    //java Bicycle

import java.util.Scanner;

public class Bicycle{
    //main method required for every program
    public static void main(String[] args) {
        //Enter the number of counts
        
     //Declare the scanner object
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
    System.out.print(
        "Enter the number of seconds (an integer >0): ");
        double nSeconds=0;
        nSeconds=myScanner.nextDouble();
    System.out.print(
        "Enter the number of counts (an interger > 0): ");
        double nCounts=0;
        nCounts=myScanner.nextDouble();  
    
    double wheelDiameter=27.0; //use this measurement to calculate rotation
    double PI=3.14159; //value for constant of pi
    double feetPerMile=5280; //use this conversion rate to calculate distance
    double inchesPerFoot=12; //use the conversion rate to calculate distance
    double secondsPerMinute=60; //use this conversion rate to calculate time
   
;
    double nHours = nSeconds/360;
    double Distance = nCounts*((PI*((wheelDiameter)/12)/5280));
    
    System.out.println("The distance was "+(float)Distance+
    " miles and took "+nSeconds/60+" minutes.");
    System.out.println("The average mph was " 
    +(float)(Distance/nHours)*10+".");

    } //end of main method
} //end of class