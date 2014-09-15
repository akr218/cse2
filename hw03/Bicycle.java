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
        int nSeconds=0;
        nSeconds=myScanner.nextInt();
    System.out.print(
        "Enter the number of counts (an interger > 0): ");
        int nCounts=0;
        nCounts=myScanner.nextInt();  
    
    double wheelDiameter=27.0; //use this measurement to calculate rotation
    double PI=3.14159; //value for constant of pi
    double feetPerMile=5280; //use this conversion rate to calculate distance
    double inchesPerFoot=12; //use the conversion rate to calculate distance
    double secondsPerMinute=60; //use this conversion rate to calculate time
   
    
    System.out.println("The distance was "+nSeconds*nCounts+
    " and took "+nSeconds*60+" minutes.");
    System.out.println("The average mph was" 
    +nSeconds*nCounts/nSeconds*60+".");

    } //end of main method
} //end of class